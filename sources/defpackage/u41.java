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
public abstract class u41 {
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

    public static void a(Bundle bundle, AbstractCollection abstractCollection, s41 s41Var) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            int size = parcelableArrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = parcelableArrayList.get(i);
                i++;
                abstractCollection.add(f((Bundle) ((Parcelable) obj), s41Var));
            }
            return;
        }
        throw new t41("Bundle is missing the collection", s41Var);
    }

    public static Object b(Bundle bundle, s41 s41Var) {
        String string = bundle.getString("tag_value");
        if (string != null) {
            String string2 = bundle.getString("tag_class_name");
            if (string2 != null) {
                try {
                    return g(Class.forName(string2), "valueOf", s41Var).invoke(null, string);
                } catch (ClassNotFoundException e) {
                    throw new t41(kt6.o("Enum class [", string2, "] not found"), s41Var, e);
                } catch (IllegalArgumentException e2) {
                    throw new t41(b10.i("Enum value [", string, "] does not exist in enum class [", string2, "]"), s41Var, e2);
                } catch (ReflectiveOperationException e3) {
                    throw new t41(kt6.o("Enum of class [", string2, "] missing valueOf method"), s41Var, e3);
                }
            }
            throw new t41(kt6.o("Missing enum className [", string2, "]"), s41Var);
        }
        throw new t41(kt6.o("Missing enum name [", string, "]"), s41Var);
    }

    public static Object c(Bundle bundle, s41 s41Var) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder != null) {
            String string = bundle.getString("tag_class_name");
            if (string != null) {
                try {
                    Object invoke = g(Class.forName(string), "asInterface", s41Var).invoke(null, binder);
                    if (invoke != null) {
                        return invoke;
                    }
                    throw new t41("Failed to get interface from binder", s41Var);
                } catch (ClassNotFoundException e) {
                    throw new t41("Binder for unknown IInterface: ".concat(string), s41Var, e);
                } catch (ReflectiveOperationException e2) {
                    throw new t41("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), s41Var, e2);
                }
            }
            throw new t41("Bundle is missing IInterface class name", s41Var);
        }
        throw new t41("Bundle is missing the binder", s41Var);
    }

    public static HashMap d(Bundle bundle, s41 s41Var) {
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
                    Object f2 = f(bundle3, s41Var);
                    if (bundle4 == null) {
                        f = null;
                    } else {
                        f = f(bundle4, s41Var);
                    }
                    hashMap.put(f2, f);
                } else {
                    throw new t41("Bundle is missing key", s41Var);
                }
            }
            return hashMap;
        }
        throw new t41("Bundle is missing the map", s41Var);
    }

    public static Object e(Bundle bundle, s41 s41Var) {
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
                        field.set(newInstance, f((Bundle) obj2, s41Var));
                    } else if (obj2 == null && Log.isLoggable("CarApp.Bun", 3)) {
                        Log.d("CarApp.Bun", "Value is null for field: " + field);
                    }
                }
                return newInstance;
            } catch (ClassNotFoundException e) {
                throw new t41("Object for unknown class: ".concat(string), s41Var, e);
            } catch (IllegalArgumentException e2) {
                throw new t41("Failed to deserialize class: ".concat(string), s41Var, e2);
            } catch (NoSuchMethodException e3) {
                throw new t41("Object missing no args constructor: ".concat(string), s41Var, e3);
            } catch (ReflectiveOperationException e4) {
                throw new t41("Constructor or field is not accessible: ".concat(string), s41Var, e4);
            }
        }
        throw new t41("Bundle is missing the class name", s41Var);
    }

    public static Object f(Bundle bundle, s41 s41Var) {
        Object obj;
        AbstractCollection hashSet;
        String str;
        ClassLoader classLoader = u41.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str2 = (String) b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str2 == null) {
            str2 = "unknown";
        }
        s41 s41Var2 = new s41(bundle, str2, s41Var.b);
        try {
            switch (i) {
                case 0:
                    obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new t41("Bundle is missing the primitive value", s41Var2);
                    }
                    s41Var2.close();
                    return obj;
                case 1:
                    obj = c(bundle, s41Var2);
                    s41Var2.close();
                    return obj;
                case 2:
                    obj = d(bundle, s41Var2);
                    s41Var2.close();
                    return obj;
                case 3:
                    hashSet = new HashSet();
                    a(bundle, hashSet, s41Var2);
                    s41Var2.close();
                    return hashSet;
                case 4:
                    hashSet = new ArrayList();
                    a(bundle, hashSet, s41Var2);
                    s41Var2.close();
                    return hashSet;
                case 5:
                    obj = e(bundle, s41Var2);
                    s41Var2.close();
                    return obj;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 != null) {
                        obj = IconCompat.a(bundle2);
                        if (obj == null) {
                            throw new t41("Failed to create IconCompat from bundle", s41Var2);
                        }
                        s41Var2.close();
                        return obj;
                    }
                    throw new t41("IconCompat bundle is null", s41Var2);
                case 7:
                    obj = b(bundle, s41Var2);
                    s41Var2.close();
                    return obj;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string != null) {
                        try {
                            obj = Class.forName(string);
                            s41Var2.close();
                            return obj;
                        } catch (ClassNotFoundException e) {
                            throw new t41("Class name is unknown: ".concat(str), s41Var2, e);
                        }
                    }
                    throw new t41("Class is missing the class name", s41Var2);
                case 9:
                    obj = bundle.getBinder("tag_value");
                    if (obj == null) {
                        throw new t41("Bundle is missing the binder", s41Var2);
                    }
                    s41Var2.close();
                    return obj;
                case 10:
                    obj = n58.a(bundle);
                    s41Var2.close();
                    return obj;
                default:
                    throw new t41("Unsupported class type in bundle: " + i, s41Var2);
            }
        } catch (Throwable th) {
            try {
                s41Var2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Method g(Class cls, String str, s41 s41Var) {
        Method[] declaredMethods;
        if (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            return g(cls.getSuperclass(), str, s41Var);
        }
        throw new t41("No method " + str + " in class " + cls, s41Var);
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

    public static Bundle j(Collection collection, s41 s41Var) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Object obj : collection) {
            arrayList.add(o(obj, "<item " + i + ">", s41Var));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, s41 s41Var) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", s41Var).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new t41("Enum missing name method", s41Var, e);
        }
    }

    public static Bundle l(Map map, s41 s41Var) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            Object key = entry.getKey();
            bundle2.putBundle("tag_1", o(key, "<key " + i + ">", s41Var));
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                bundle2.putBundle("tag_2", o(value, "<value " + i + ">", s41Var));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, s41 s41Var) {
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
                String h2 = b10.h(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        bundle.putParcelable(h2, o(obj3, field.getName(), s41Var));
                    }
                } catch (IllegalAccessException e) {
                    throw new t41("Field is not accessible: ".concat(h2), s41Var, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new t41("Class to deserialize is missing a no args constructor: ".concat(name), s41Var, e2);
        }
    }

    public static Bundle n(Object obj, s41 s41Var) {
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
            throw new t41("Unsupported primitive type: ".concat(obj.getClass().getName()), s41Var);
        }
    }

    public static Bundle o(Object obj, String str, s41 s41Var) {
        Bundle n;
        Bundle bundle;
        ArrayDeque arrayDeque = s41Var.b;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((r41) it.next()).a == obj) {
                    throw new t41("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), s41Var);
                }
            }
        }
        s41 s41Var2 = new s41(obj, str, arrayDeque);
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
                            n = l((Map) obj, s41Var2);
                        } else if (obj instanceof List) {
                            n = j((List) obj, s41Var2);
                            n.putInt("tag_class_type", 4);
                        } else if (obj instanceof Set) {
                            n = j((Set) obj, s41Var2);
                            n.putInt("tag_class_type", 3);
                        } else if (obj.getClass().isEnum()) {
                            n = k(obj, s41Var2);
                        } else if (obj instanceof Class) {
                            bundle = new Bundle(2);
                            bundle.putInt("tag_class_type", 8);
                            bundle.putString("tag_value", ((Class) obj).getName());
                        } else if (!obj.getClass().isArray()) {
                            if (obj instanceof n58) {
                                n = ((n58) obj).b();
                                n.putInt("tag_class_type", 10);
                            } else {
                                n = m(obj, s41Var2);
                            }
                        } else {
                            throw new t41("Object serializing contains an array, use a list or a set instead", s41Var2);
                        }
                    } else {
                        n = n(obj, s41Var2);
                    }
                    s41Var2.close();
                    return n;
                }
                s41Var2.close();
                return bundle;
            }
            throw new t41("Bundling of null object is not supported", s41Var2);
        } catch (Throwable th) {
            try {
                s41Var2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
