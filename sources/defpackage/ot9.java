package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public final class ot9 {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final ut9 e;

    public ot9(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new hq2(this, (byte) 3);
        linkedHashMap.putAll(hashMap);
    }

    public static final Bundle a(ot9 ot9Var) {
        Map map;
        LinkedHashMap linkedHashMap = ot9Var.a;
        LinkedHashMap linkedHashMap2 = ot9Var.b;
        linkedHashMap2.getClass();
        int size = linkedHashMap2.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(linkedHashMap2);
            } else {
                Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
                map.getClass();
            }
        } else {
            map = y24.a;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            rj7 rj7Var = null;
            int i = 0;
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str = (String) entry2.getKey();
                Bundle c = ((ut9) entry2.getValue()).c();
                str.getClass();
                if (c != null) {
                    while (i < 29) {
                        Class cls = f[i];
                        cls.getClass();
                        if (!cls.isInstance(c)) {
                            i++;
                        }
                    }
                    Class<?> cls2 = c.getClass();
                    throw new IllegalArgumentException("Can't put value with type " + cls2 + " into saved state");
                }
                Object obj = ot9Var.c.get(str);
                if (obj instanceof rj7) {
                    rj7Var = (rj7) obj;
                }
                if (rj7Var != null) {
                    rj7Var.i(c);
                } else {
                    linkedHashMap.put(str, c);
                }
                k0b k0bVar = (k0b) ot9Var.d.get(str);
                if (k0bVar != null) {
                    k0bVar.b(c);
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : keySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap.get(str2));
                }
                rx7[] rx7VarArr = {new rx7("keys", arrayList), new rx7("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    rx7 rx7Var = rx7VarArr[i];
                    String str3 = (String) rx7Var.a;
                    Object obj2 = rx7Var.b;
                    if (obj2 == null) {
                        bundle.putString(str3, null);
                    } else if (obj2 instanceof Boolean) {
                        bundle.putBoolean(str3, ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof Byte) {
                        bundle.putByte(str3, ((Number) obj2).byteValue());
                    } else if (obj2 instanceof Character) {
                        bundle.putChar(str3, ((Character) obj2).charValue());
                    } else if (obj2 instanceof Double) {
                        bundle.putDouble(str3, ((Number) obj2).doubleValue());
                    } else if (obj2 instanceof Float) {
                        bundle.putFloat(str3, ((Number) obj2).floatValue());
                    } else if (obj2 instanceof Integer) {
                        bundle.putInt(str3, ((Number) obj2).intValue());
                    } else if (obj2 instanceof Long) {
                        bundle.putLong(str3, ((Number) obj2).longValue());
                    } else if (obj2 instanceof Short) {
                        bundle.putShort(str3, ((Number) obj2).shortValue());
                    } else if (obj2 instanceof Bundle) {
                        bundle.putBundle(str3, (Bundle) obj2);
                    } else if (obj2 instanceof CharSequence) {
                        bundle.putCharSequence(str3, (CharSequence) obj2);
                    } else if (obj2 instanceof Parcelable) {
                        bundle.putParcelable(str3, (Parcelable) obj2);
                    } else if (obj2 instanceof boolean[]) {
                        bundle.putBooleanArray(str3, (boolean[]) obj2);
                    } else if (obj2 instanceof byte[]) {
                        bundle.putByteArray(str3, (byte[]) obj2);
                    } else if (obj2 instanceof char[]) {
                        bundle.putCharArray(str3, (char[]) obj2);
                    } else if (obj2 instanceof double[]) {
                        bundle.putDoubleArray(str3, (double[]) obj2);
                    } else if (obj2 instanceof float[]) {
                        bundle.putFloatArray(str3, (float[]) obj2);
                    } else if (obj2 instanceof int[]) {
                        bundle.putIntArray(str3, (int[]) obj2);
                    } else if (obj2 instanceof long[]) {
                        bundle.putLongArray(str3, (long[]) obj2);
                    } else if (obj2 instanceof short[]) {
                        bundle.putShortArray(str3, (short[]) obj2);
                    } else if (obj2 instanceof Object[]) {
                        Class<?> componentType = obj2.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str3, (Parcelable[]) obj2);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str3, (String[]) obj2);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str3, (CharSequence[]) obj2);
                        } else if (Serializable.class.isAssignableFrom(componentType)) {
                            bundle.putSerializable(str3, (Serializable) obj2);
                        } else {
                            String canonicalName = componentType.getCanonicalName();
                            throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + str3 + '\"');
                        }
                    } else if (obj2 instanceof Serializable) {
                        bundle.putSerializable(str3, (Serializable) obj2);
                    } else if (obj2 instanceof IBinder) {
                        bundle.putBinder(str3, (IBinder) obj2);
                    } else if (obj2 instanceof Size) {
                        bundle.putSize(str3, (Size) obj2);
                    } else if (obj2 instanceof SizeF) {
                        bundle.putSizeF(str3, (SizeF) obj2);
                    } else {
                        String canonicalName2 = obj2.getClass().getCanonicalName();
                        throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + str3 + '\"');
                    }
                    i++;
                }
                return bundle;
            }
        }
    }

    public ot9() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new hq2(this, (byte) 3);
    }
}
