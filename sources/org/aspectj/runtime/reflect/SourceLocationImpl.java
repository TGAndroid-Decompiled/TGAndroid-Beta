package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.SourceLocation;
class SourceLocationImpl implements SourceLocation {
    String fileName;
    int line;

    public SourceLocationImpl(Class cls, String str, int i) {
        this.fileName = str;
        this.line = i;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getLine() {
        return this.line;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getFileName());
        stringBuffer.append(":");
        stringBuffer.append(getLine());
        return stringBuffer.toString();
    }
}
