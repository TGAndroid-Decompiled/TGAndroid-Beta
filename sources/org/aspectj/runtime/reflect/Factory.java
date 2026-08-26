package org.aspectj.runtime.reflect;

import androidx.emoji2.text.MetadataRepo;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.telegram.ui.iv.RichMapCell;

public final class Factory {
    public static final Object[] NO_ARGS;
    public static Class class$java$lang$ClassNotFoundException;
    public static final Hashtable prims;
    public final ClassLoader lookupClassLoader;

    static {
        Hashtable hashtable = new Hashtable();
        prims = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        NO_ARGS = new Object[0];
    }

    public Factory(Class cls, String str) {
        this.lookupClassLoader = cls.getClassLoader();
    }

    public static Class makeClass(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) prims.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = class$java$lang$ClassNotFoundException;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    class$java$lang$ClassNotFoundException = cls2;
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
            return cls2;
        }
    }

    public static MetadataRepo makeJP(RichMapCell.AnonymousClass1 anonymousClass1, Object obj, Object obj2) {
        return new MetadataRepo(anonymousClass1, obj, obj2, NO_ARGS);
    }

    public final MethodSignatureImpl makeMethodSig(String str, String str2, String str3, String str4, String str5) {
        int i = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.lookupClassLoader;
        Class clsMakeClass = makeClass(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i2 = 0; i2 < iCountTokens; i2++) {
            clsArr[i2] = makeClass(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i3 = 0; i3 < iCountTokens2; i3++) {
            strArr[i3] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i4 = 0; i4 < iCountTokens3; i4++) {
            clsArr2[i4] = makeClass(classLoader, stringTokenizer3.nextToken());
        }
        Class clsMakeClass2 = makeClass(classLoader, str5);
        MethodSignatureImpl methodSignatureImpl = new MethodSignatureImpl(0);
        methodSignatureImpl.modifiers = i;
        methodSignatureImpl.name = str;
        methodSignatureImpl.declaringType = clsMakeClass;
        methodSignatureImpl.parameterTypes = clsArr;
        methodSignatureImpl.returnType = clsMakeClass2;
        return methodSignatureImpl;
    }

    public final RichMapCell.AnonymousClass1 makeSJP(MethodSignatureImpl methodSignatureImpl) {
        RichMapCell.AnonymousClass1 anonymousClass1 = new RichMapCell.AnonymousClass1(11);
        anonymousClass1.this$0 = methodSignatureImpl;
        return anonymousClass1;
    }

    public static MetadataRepo makeJP(RichMapCell.AnonymousClass1 anonymousClass1, Object obj, Object obj2, Object obj3) {
        return new MetadataRepo(anonymousClass1, obj, obj2, new Object[]{obj3});
    }
}
