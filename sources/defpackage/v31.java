package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public abstract class v31 {
    public static final ArrayMap a;
    public static final ArrayMap b;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        b = arrayMap2;
    }

    public static void a(Bundle bundle, AbstractCollection abstractCollection, t31 t31Var) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            int size = parcelableArrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = parcelableArrayList.get(i);
                i++;
                abstractCollection.add(f((Bundle) ((Parcelable) obj), t31Var));
            }
            return;
        }
        throw new u31("Bundle is missing the collection", t31Var);
    }

    public static Object b(Bundle bundle, t31 t31Var) {
        String string = bundle.getString("tag_value");
        if (string != null) {
            String string2 = bundle.getString("tag_class_name");
            if (string2 != null) {
                try {
                    return g(Class.forName(string2), "valueOf", t31Var).invoke(null, string);
                } catch (ClassNotFoundException e) {
                    throw new u31(qd4.y("Enum class [", string2, "] not found"), t31Var, e);
                } catch (IllegalArgumentException e2) {
                    throw new u31(c00.j("Enum value [", string, "] does not exist in enum class [", string2, "]"), t31Var, e2);
                } catch (ReflectiveOperationException e3) {
                    throw new u31(qd4.y("Enum of class [", string2, "] missing valueOf method"), t31Var, e3);
                }
            }
            throw new u31(qd4.y("Missing enum className [", string2, "]"), t31Var);
        }
        throw new u31(qd4.y("Missing enum name [", string, "]"), t31Var);
    }

    public static Object c(Bundle bundle, t31 t31Var) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder != null) {
            String string = bundle.getString("tag_class_name");
            if (string != null) {
                try {
                    Object invoke = g(Class.forName(string), "asInterface", t31Var).invoke(null, binder);
                    if (invoke != null) {
                        return invoke;
                    }
                    throw new u31("Failed to get interface from binder", t31Var);
                } catch (ClassNotFoundException e) {
                    throw new u31("Binder for unknown IInterface: ".concat(string), t31Var, e);
                } catch (ReflectiveOperationException e2) {
                    throw new u31("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), t31Var, e2);
                }
            }
            throw new u31("Bundle is missing IInterface class name", t31Var);
        }
        throw new u31("Bundle is missing the binder", t31Var);
    }

    public static HashMap d(Bundle bundle, t31 t31Var) {
        Object f;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            HashMap hashMap = new HashMap();
            int size = parcelableArrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = parcelableArrayList.get(i);
                i++;
                Bundle bundle2 = (Bundle) ((Parcelable) obj);
                Bundle bundle3 = bundle2.getBundle("tag_1");
                Bundle bundle4 = bundle2.getBundle("tag_2");
                if (bundle3 != null) {
                    Object f2 = f(bundle3, t31Var);
                    if (bundle4 == null) {
                        f = null;
                    } else {
                        f = f(bundle4, t31Var);
                    }
                    hashMap.put(f2, f);
                } else {
                    throw new u31("Bundle is missing key", t31Var);
                }
            }
            return hashMap;
        }
        throw new u31("Bundle is missing the map", t31Var);
    }

    public static Object e(Bundle bundle, t31 t31Var) {
        String string = bundle.getString("tag_class_name");
        if (string != null) {
            try {
                Class<?> cls = Class.forName(string);
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(null);
                ArrayList h = h(cls);
                int size = h.size();
                int i = 0;
                while (i < size) {
                    Object obj = h.get(i);
                    i++;
                    Field field = (Field) obj;
                    field.setAccessible(true);
                    String str = field.getDeclaringClass().getName() + field.getName();
                    Object obj2 = bundle.get(str);
                    if (obj2 == null) {
                        obj2 = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                    }
                    if (obj2 instanceof Bundle) {
                        field.set(newInstance, f((Bundle) obj2, t31Var));
                    } else if (obj2 == null && Log.isLoggable("CarApp.Bun", 3)) {
                        Log.d("CarApp.Bun", "Value is null for field: " + field);
                    }
                }
                return newInstance;
            } catch (ClassNotFoundException e) {
                throw new u31("Object for unknown class: ".concat(string), t31Var, e);
            } catch (IllegalArgumentException e2) {
                throw new u31("Failed to deserialize class: ".concat(string), t31Var, e2);
            } catch (NoSuchMethodException e3) {
                throw new u31("Object missing no args constructor: ".concat(string), t31Var, e3);
            } catch (ReflectiveOperationException e4) {
                throw new u31("Constructor or field is not accessible: ".concat(string), t31Var, e4);
            }
        }
        throw new u31("Bundle is missing the class name", t31Var);
    }

    public static Object f(Bundle bundle, t31 t31Var) {
        Object obj;
        AbstractCollection hashSet;
        String str;
        ClassLoader classLoader = v31.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str2 = (String) b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str2 == null) {
            str2 = "unknown";
        }
        t31 t31Var2 = new t31(bundle, str2, t31Var.b);
        try {
            switch (i) {
                case 0:
                    obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new u31("Bundle is missing the primitive value", t31Var2);
                    }
                    t31Var2.close();
                    return obj;
                case 1:
                    obj = c(bundle, t31Var2);
                    t31Var2.close();
                    return obj;
                case 2:
                    obj = d(bundle, t31Var2);
                    t31Var2.close();
                    return obj;
                case 3:
                    hashSet = new HashSet();
                    a(bundle, hashSet, t31Var2);
                    t31Var2.close();
                    return hashSet;
                case 4:
                    hashSet = new ArrayList();
                    a(bundle, hashSet, t31Var2);
                    t31Var2.close();
                    return hashSet;
                case 5:
                    obj = e(bundle, t31Var2);
                    t31Var2.close();
                    return obj;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 != null) {
                        obj = IconCompat.a(bundle2);
                        if (obj == null) {
                            throw new u31("Failed to create IconCompat from bundle", t31Var2);
                        }
                        t31Var2.close();
                        return obj;
                    }
                    throw new u31("IconCompat bundle is null", t31Var2);
                case 7:
                    obj = b(bundle, t31Var2);
                    t31Var2.close();
                    return obj;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string != null) {
                        try {
                            obj = Class.forName(string);
                            t31Var2.close();
                            return obj;
                        } catch (ClassNotFoundException e) {
                            throw new u31("Class name is unknown: ".concat(str), t31Var2, e);
                        }
                    }
                    throw new u31("Class is missing the class name", t31Var2);
                case 9:
                    obj = bundle.getBinder("tag_value");
                    if (obj == null) {
                        throw new u31("Bundle is missing the binder", t31Var2);
                    }
                    t31Var2.close();
                    return obj;
                case 10:
                    obj = b78.a(bundle);
                    t31Var2.close();
                    return obj;
                default:
                    throw new u31("Unsupported class type in bundle: " + i, t31Var2);
            }
        } catch (Throwable th) {
            try {
                t31Var2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Method g(Class cls, String str, t31 t31Var) {
        Method[] declaredMethods;
        if (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            return g(cls.getSuperclass(), str, t31Var);
        }
        throw new u31("No method " + str + " in class " + cls, t31Var);
    }

    public static ArrayList h(Class cls) {
        Field[] declaredFields;
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(h(cls.getSuperclass()));
        }
        return arrayList;
    }

    public static String i(Class cls) {
        String str = (String) a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
            return cls.getSimpleName();
        }
        return str;
    }

    public static Bundle j(Collection collection, t31 t31Var) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Object obj : collection) {
            arrayList.add(o(obj, "<item " + i + ">", t31Var));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, t31 t31Var) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", t31Var).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new u31("Enum missing name method", t31Var, e);
        }
    }

    public static Bundle l(Map map, t31 t31Var) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            Object key = entry.getKey();
            bundle2.putBundle("tag_1", o(key, "<key " + i + ">", t31Var));
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                bundle2.putBundle("tag_2", o(value, "<value " + i + ">", t31Var));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, t31 t31Var) {
        String name = obj.getClass().getName();
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList h = h(obj.getClass());
            Bundle bundle = new Bundle(h.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            int size = h.size();
            int i = 0;
            while (i < size) {
                Object obj2 = h.get(i);
                i++;
                Field field = (Field) obj2;
                field.setAccessible(true);
                String i2 = c00.i(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        bundle.putParcelable(i2, o(obj3, field.getName(), t31Var));
                    }
                } catch (IllegalAccessException e) {
                    throw new u31("Field is not accessible: ".concat(i2), t31Var, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new u31("Class to deserialize is missing a no args constructor: ".concat(name), t31Var, e2);
        }
    }

    public static Bundle n(Object obj, t31 t31Var) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        } else if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        } else if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        } else if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        } else if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        } else if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        } else if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        } else if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        } else if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable("tag_value", (Parcelable) obj);
            return bundle;
        } else {
            throw new u31("Unsupported primitive type: ".concat(obj.getClass().getName()), t31Var);
        }
    }

    public static Bundle o(Object obj, String str, t31 t31Var) {
        Bundle n;
        Bundle bundle;
        ArrayDeque arrayDeque = t31Var.b;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((s31) it.next()).a == obj) {
                    throw new u31("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), t31Var);
                }
            }
        }
        t31 t31Var2 = new t31(obj, str, arrayDeque);
        try {
            if (obj != null) {
                if (obj instanceof IconCompat) {
                    bundle = new Bundle(2);
                    bundle.putInt("tag_class_type", 6);
                    bundle.putBundle("tag_value", ((IconCompat) obj).l());
                } else {
                    if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                        if (obj instanceof IInterface) {
                            IInterface iInterface = (IInterface) obj;
                            bundle = new Bundle(3);
                            String name = iInterface.getClass().getName();
                            bundle.putInt("tag_class_type", 1);
                            bundle.putBinder("tag_value", iInterface.asBinder());
                            bundle.putString("tag_class_name", name);
                        } else if (obj instanceof IBinder) {
                            bundle = new Bundle(2);
                            bundle.putInt("tag_class_type", 9);
                            bundle.putBinder("tag_value", (IBinder) obj);
                        } else if (obj instanceof Map) {
                            n = l((Map) obj, t31Var2);
                        } else if (obj instanceof List) {
                            n = j((List) obj, t31Var2);
                            n.putInt("tag_class_type", 4);
                        } else if (obj instanceof Set) {
                            n = j((Set) obj, t31Var2);
                            n.putInt("tag_class_type", 3);
                        } else if (obj.getClass().isEnum()) {
                            n = k(obj, t31Var2);
                        } else if (obj instanceof Class) {
                            bundle = new Bundle(2);
                            bundle.putInt("tag_class_type", 8);
                            bundle.putString("tag_value", ((Class) obj).getName());
                        } else if (!obj.getClass().isArray()) {
                            if (obj instanceof b78) {
                                n = ((b78) obj).b();
                                n.putInt("tag_class_type", 10);
                            } else {
                                n = m(obj, t31Var2);
                            }
                        } else {
                            throw new u31("Object serializing contains an array, use a list or a set instead", t31Var2);
                        }
                    } else {
                        n = n(obj, t31Var2);
                    }
                    t31Var2.close();
                    return n;
                }
                t31Var2.close();
                return bundle;
            }
            throw new u31("Bundling of null object is not supported", t31Var2);
        } catch (Throwable th) {
            try {
                t31Var2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
