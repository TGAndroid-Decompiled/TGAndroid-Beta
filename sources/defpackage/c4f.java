package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class c4f {
    public static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        Field[] fields;
        String str2;
        String str3;
        int length;
        if (obj != null) {
            if (obj instanceof o6e) {
                int length2 = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(b(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (type.isArray() && type.getComponentType() != Byte.TYPE) {
                            if (obj2 == null) {
                                length = 0;
                            } else {
                                length = Array.getLength(obj2);
                            }
                            for (int i = 0; i < length; i++) {
                                a(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                            }
                        } else {
                            a(name, obj2, stringBuffer, stringBuffer2);
                        }
                    }
                }
                for (Method method : cls.getMethods()) {
                    String name2 = method.getName();
                    if (name2.startsWith("set")) {
                        String substring = name2.substring(3);
                        try {
                            if (substring.length() != 0) {
                                str2 = "has".concat(substring);
                            } else {
                                str2 = new String("has");
                            }
                            if (((Boolean) cls.getMethod(str2, null).invoke(obj, null)).booleanValue()) {
                                if (substring.length() != 0) {
                                    str3 = "get".concat(substring);
                                } else {
                                    str3 = new String("get");
                                }
                                a(substring, cls.getMethod(str3, null).invoke(obj, null), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length2);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                return;
            }
            String b = b(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(b);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!str4.startsWith("http") && str4.length() > 200) {
                    str4 = str4.substring(0, 200).concat("[...]");
                }
                int length3 = str4.length();
                StringBuilder sb = new StringBuilder(length3);
                for (int i2 = 0; i2 < length3; i2++) {
                    char charAt = str4.charAt(i2);
                    if (charAt >= ' ' && charAt <= '~' && charAt != '\"' && charAt != '\'') {
                        sb.append(charAt);
                    } else {
                        sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                    }
                }
                String sb2 = sb.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(sb2);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                stringBuffer2.append('\"');
                for (byte b2 : (byte[]) obj) {
                    int i3 = b2 & 255;
                    if (i3 != 92 && i3 != 34) {
                        if (i3 < 32 || i3 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                        }
                    } else {
                        stringBuffer2.append('\\');
                    }
                    stringBuffer2.append((char) i3);
                }
                stringBuffer2.append('\"');
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    public static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }
}
