package io.noties.markwon.html.jsoup.nodes;

import io.noties.markwon.html.jsoup.helper.Validate;
import java.util.Arrays;
import java.util.Iterator;

public class Attributes implements Iterable, Cloneable {
    private static final String[] Empty = new String[0];
    String[] keys;
    private int size = 0;
    String[] vals;

    public Attributes() {
        String[] strArr = Empty;
        this.keys = strArr;
        this.vals = strArr;
    }

    private void checkCapacity(int i) {
        Validate.isTrue(i >= this.size);
        String[] strArr = this.keys;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 4 ? this.size * 2 : 4;
        if (i <= i2) {
            i = i2;
        }
        this.keys = copyOf(strArr, i);
        this.vals = copyOf(this.vals, i);
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    int indexOfKey(String str) {
        Validate.notNull(str);
        for (int i = 0; i < this.size; i++) {
            if (str.equals(this.keys[i])) {
                return i;
            }
        }
        return -1;
    }

    static String checkNotNull(String str) {
        return str == null ? "" : str;
    }

    public String get(String str) {
        int iIndexOfKey = indexOfKey(str);
        return iIndexOfKey == -1 ? "" : checkNotNull(this.vals[iIndexOfKey]);
    }

    private void add(String str, String str2) {
        checkCapacity(this.size + 1);
        String[] strArr = this.keys;
        int i = this.size;
        strArr[i] = str;
        this.vals[i] = str2;
        this.size = i + 1;
    }

    public Attributes put(String str, String str2) {
        int iIndexOfKey = indexOfKey(str);
        if (iIndexOfKey != -1) {
            this.vals[iIndexOfKey] = str2;
        } else {
            add(str, str2);
        }
        return this;
    }

    public void remove(int i) {
        Validate.isFalse(i >= this.size);
        int i2 = (this.size - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.keys;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.vals;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.size - 1;
        this.size = i4;
        this.keys[i4] = null;
        this.vals[i4] = null;
    }

    public int size() {
        return this.size;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return this.i < Attributes.this.size;
            }

            @Override
            public Attribute next() {
                Attributes attributes = Attributes.this;
                String[] strArr = attributes.vals;
                int i = this.i;
                String str = strArr[i];
                String str2 = attributes.keys[i];
                if (str == null) {
                    str = "";
                }
                Attribute attribute = new Attribute(str2, str, attributes);
                this.i++;
                return attribute;
            }

            @Override
            public void remove() {
                Attributes attributes = Attributes.this;
                int i = this.i - 1;
                this.i = i;
                attributes.remove(i);
            }
        };
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.size == attributes.size && Arrays.equals(this.keys, attributes.keys)) {
            return Arrays.equals(this.vals, attributes.vals);
        }
        return false;
    }

    public int hashCode() {
        return (((this.size * 31) + Arrays.hashCode(this.keys)) * 31) + Arrays.hashCode(this.vals);
    }

    public Attributes m289clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.size = this.size;
            this.keys = copyOf(this.keys, this.size);
            this.vals = copyOf(this.vals, this.size);
            return attributes;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
