package org.telegram.messenger.audioinfo.m4a;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.io.DataInputStream;
import java.io.EOFException;
import org.commonmark.node.Node;
import org.telegram.messenger.audioinfo.util.PositionInputStream;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public final class MP4Atom extends Node {
    public final int $r8$classId;

    public MP4Atom(PositionInputStream positionInputStream, Node node, String str, int i) {
        super(positionInputStream, node, str);
        this.$r8$classId = i;
    }

    public static void appendPath(StringBuffer stringBuffer, Node node) {
        Node node2 = (Node) node.firstChild;
        if (node2 != null) {
            appendPath(stringBuffer, node2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) node.lastChild);
    }

    public long getRemaining() {
        return ((RangeInputStream) ((PositionInputStream) this.parent)).getRemainingLength();
    }

    public boolean hasMoreChildren() {
        MP4Atom mP4Atom = (MP4Atom) this.next;
        return (mP4Atom != null ? mP4Atom.getRemaining() : 0L) < getRemaining();
    }

    public String readString(int i, String str) {
        byte[] bArr = new byte[i];
        ((DataInputStream) this.prev).readFully(bArr);
        String str2 = new String(bArr, str);
        int iIndexOf = str2.indexOf(0);
        return iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
    }

    public void skip(int i) {
        int i2 = 0;
        while (i2 < i) {
            int iSkipBytes = ((DataInputStream) this.prev).skipBytes(i - i2);
            if (iSkipBytes <= 0) {
                throw new EOFException();
            }
            i2 += iSkipBytes;
        }
    }

    @Override
    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                appendPath(stringBuffer, this);
                stringBuffer.append("[off=");
                long j = ((PositionInputStream) ((Node) this.firstChild).parent).position;
                PositionInputStream positionInputStream = (PositionInputStream) this.parent;
                stringBuffer.append(j - positionInputStream.position);
                stringBuffer.append(",pos=");
                stringBuffer.append(positionInputStream.position);
                stringBuffer.append(",len=");
                RangeInputStream rangeInputStream = (RangeInputStream) positionInputStream;
                stringBuffer.append(rangeInputStream.getRemainingLength() + rangeInputStream.position);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder("mp4[pos="), ((PositionInputStream) this.parent).position, "]");
        }
    }
}
