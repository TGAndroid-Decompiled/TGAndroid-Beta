package org.aspectj.runtime.reflect;

public final class StringMaker {
    public static final StringMaker middleStringMaker;
    public boolean includeArgs;
    public boolean includeModifiers;
    public boolean shortPrimaryTypeNames;
    public boolean shortTypeNames;

    static {
        StringMaker stringMaker = new StringMaker();
        stringMaker.shortTypeNames = true;
        stringMaker.includeArgs = true;
        stringMaker.includeModifiers = false;
        stringMaker.shortPrimaryTypeNames = false;
        middleStringMaker = stringMaker;
        stringMaker.shortTypeNames = true;
        stringMaker.includeArgs = true;
        stringMaker.includeModifiers = false;
        stringMaker.shortPrimaryTypeNames = false;
    }

    public static String makeTypeName(String str, Class cls, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(makeTypeName(componentType.getName(), componentType, z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z) {
            return str.replace('$', '.');
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
