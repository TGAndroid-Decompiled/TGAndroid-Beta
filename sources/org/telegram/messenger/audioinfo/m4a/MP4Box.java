package org.telegram.messenger.audioinfo.m4a;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import org.telegram.messenger.audioinfo.util.PositionInputStream;
import org.telegram.messenger.audioinfo.util.RangeInputStream;

public abstract class MP4Box {
    private MP4Atom child;
    protected final DataInput data;
    private final PositionInputStream input;
    private final MP4Box parent;
    private final String type;

    public MP4Box(PositionInputStream positionInputStream, MP4Box mP4Box, String str) {
        this.input = positionInputStream;
        this.parent = mP4Box;
        this.type = str;
        this.data = new DataInputStream(positionInputStream);
    }

    public String getType() {
        return this.type;
    }

    public MP4Box getParent() {
        return this.parent;
    }

    public long getPosition() {
        return this.input.getPosition();
    }

    public PositionInputStream getInput() {
        return this.input;
    }

    public MP4Atom getChild() {
        return this.child;
    }

    public MP4Atom nextChild() {
        RangeInputStream rangeInputStream;
        MP4Atom mP4Atom = this.child;
        if (mP4Atom != null) {
            mP4Atom.skip();
        }
        int readInt = this.data.readInt();
        byte[] bArr = new byte[4];
        this.data.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        if (readInt == 1) {
            rangeInputStream = new RangeInputStream(this.input, 16L, this.data.readLong() - 16);
        } else {
            rangeInputStream = new RangeInputStream(this.input, 8L, readInt - 8);
        }
        MP4Atom mP4Atom2 = new MP4Atom(rangeInputStream, this, str);
        this.child = mP4Atom2;
        return mP4Atom2;
    }

    public MP4Atom nextChild(String str) {
        MP4Atom nextChild = nextChild();
        if (nextChild.getType().matches(str)) {
            return nextChild;
        }
        throw new IOException("atom type mismatch, expected " + str + ", got " + nextChild.getType());
    }
}
