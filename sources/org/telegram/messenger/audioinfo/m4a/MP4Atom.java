package org.telegram.messenger.audioinfo.m4a;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.io.DataInputStream;
import java.io.EOFException;
import org.telegram.messenger.audioinfo.util.PositionInputStream;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public final class MP4Atom {
    public final int $r8$classId;
    public MP4Atom child;
    public final DataInputStream data;
    public final PositionInputStream input;
    public final MP4Atom parent;
    public final String type;

    public MP4Atom(PositionInputStream positionInputStream, MP4Atom mP4Atom, String str, int i) {
        this.$r8$classId = i;
        this.input = positionInputStream;
        this.parent = mP4Atom;
        this.type = str;
        this.data = new DataInputStream(positionInputStream);
    }

    public static void appendPath(StringBuffer stringBuffer, MP4Atom mP4Atom) {
        MP4Atom mP4Atom2 = mP4Atom.parent;
        if (mP4Atom2 != null) {
            appendPath(stringBuffer, mP4Atom2);
            stringBuffer.append("/");
        }
        stringBuffer.append(mP4Atom.type);
    }

    public long getRemaining() {
        return ((RangeInputStream) this.input).getRemainingLength();
    }

    public boolean hasMoreChildren() {
        MP4Atom mP4Atom = this.child;
        return (mP4Atom != null ? mP4Atom.getRemaining() : 0L) < getRemaining();
    }

    public final MP4Atom nextChild() {
        RangeInputStream rangeInputStream;
        MP4Atom mP4Atom = this.child;
        if (mP4Atom != null) {
            while (mP4Atom.getRemaining() > 0) {
                if (((RangeInputStream) mP4Atom.input).skip(mP4Atom.getRemaining()) == 0) {
                    throw new EOFException("Cannot skip atom");
                }
            }
        }
        DataInputStream dataInputStream = this.data;
        int i = dataInputStream.readInt();
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (i == 1) {
            rangeInputStream = new RangeInputStream(this.input, 16L, dataInputStream.readLong() - 16);
        } else {
            rangeInputStream = new RangeInputStream(this.input, 8L, i - 8);
        }
        MP4Atom mP4Atom2 = new MP4Atom(rangeInputStream, this, str, 0);
        this.child = mP4Atom2;
        return mP4Atom2;
    }

    public String readString(int i, String str) {
        byte[] bArr = new byte[i];
        this.data.readFully(bArr);
        String str2 = new String(bArr, str);
        int iIndexOf = str2.indexOf(0);
        return iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
    }

    public void skip(int i) {
        int i2 = 0;
        while (i2 < i) {
            int iSkipBytes = this.data.skipBytes(i - i2);
            if (iSkipBytes <= 0) {
                throw new EOFException();
            }
            i2 += iSkipBytes;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                appendPath(stringBuffer, this);
                stringBuffer.append("[off=");
                long j = this.parent.input.position;
                PositionInputStream positionInputStream = this.input;
                stringBuffer.append(j - positionInputStream.position);
                stringBuffer.append(",pos=");
                stringBuffer.append(positionInputStream.position);
                stringBuffer.append(",len=");
                RangeInputStream rangeInputStream = (RangeInputStream) positionInputStream;
                stringBuffer.append(rangeInputStream.getRemainingLength() + rangeInputStream.position);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return Fragment$$ExternalSyntheticOutline0.m(new StringBuilder("mp4[pos="), this.input.position, "]");
        }
    }
}
