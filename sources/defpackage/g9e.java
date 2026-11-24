package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public abstract class g9e {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            b(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                zud zudVar = zud.c;
                sb.append(f2f.a(new zud(((String) obj).getBytes(h3e.a))));
                sb.append('\"');
            } else if (obj instanceof zud) {
                sb.append(": \"");
                sb.append(f2f.a((zud) obj));
                sb.append('\"');
            } else if (obj instanceof c2e) {
                sb.append(" {");
                c((c2e) obj, sb, i + 2);
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                a(sb, i3, "key", entry2.getKey());
                a(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void c(c2e c2eVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = c2eVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), c2e.i(method2, c2eVar, new Object[0]));
                    i2 = i3;
                }
            } else {
                i3 = i2;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), c2e.i(method, c2eVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i5 = c2e.i(method4, c2eVar, new Object[0]);
                    if (method5 == null) {
                        if (i5 instanceof Boolean) {
                            if (!((Boolean) i5).booleanValue()) {
                            }
                            a(sb, i, substring, i5);
                        } else if (i5 instanceof Integer) {
                            if (((Integer) i5).intValue() == 0) {
                            }
                            a(sb, i, substring, i5);
                        } else if (i5 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) i5).floatValue()) == 0) {
                            }
                            a(sb, i, substring, i5);
                        } else if (i5 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) i5).doubleValue()) == 0) {
                            }
                            a(sb, i, substring, i5);
                        } else {
                            if (i5 instanceof String) {
                                equals = i5.equals("");
                            } else if (i5 instanceof zud) {
                                equals = i5.equals(zud.c);
                            } else if (i5 instanceof rrd) {
                                if (i5 == ((c2e) ((c2e) ((rrd) i5)).d(6))) {
                                }
                                a(sb, i, substring, i5);
                            } else {
                                if ((i5 instanceof Enum) && ((Enum) i5).ordinal() == 0) {
                                }
                                a(sb, i, substring, i5);
                            }
                            if (equals) {
                            }
                            a(sb, i, substring, i5);
                        }
                    } else {
                        if (!((Boolean) c2e.i(method5, c2eVar, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, i5);
                    }
                }
            }
            i2 = i3;
        }
        iee ieeVar = c2eVar.zzc;
        if (ieeVar != null) {
            for (int i6 = 0; i6 < ieeVar.a; i6++) {
                a(sb, i, String.valueOf(ieeVar.b[i6] >>> 3), ieeVar.c[i6]);
            }
        }
    }
}
