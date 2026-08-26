package io.noties.markwon.html.jsoup.nodes;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIterator;

public final class Attributes implements Iterable, Cloneable {
    public static final String[] Empty = new String[0];
    public String[] keys;
    public int size = 0;
    public String[] vals;

    public Attributes() {
        String[] strArr = Empty;
        this.keys = strArr;
        this.vals = strArr;
    }

    public final Object clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.size = this.size;
            String[] strArr = this.keys;
            int i = this.size;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.keys = strArr2;
            String[] strArr3 = this.vals;
            int i2 = this.size;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.vals = strArr4;
            return attributes;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Attributes.class != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.size == attributes.size && Arrays.equals(this.keys, attributes.keys)) {
            return Arrays.equals(this.vals, attributes.vals);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.size * 31) + Arrays.hashCode(this.keys)) * 31) + Arrays.hashCode(this.vals);
    }

    public final int indexOfKey(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.size; i++) {
            if (str.equals(this.keys[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return new ArrayIterator(this);
    }
}
