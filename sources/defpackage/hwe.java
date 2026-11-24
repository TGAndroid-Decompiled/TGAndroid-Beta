package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
public abstract class hwe {
    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static qt b(File file, Context context) {
        wia c;
        ?? ckaVar = new cka(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.exists()) {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(fileInputStream, "UTF_8");
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1) {
                        break;
                    } else if (next == 2 && newPullParser.getName().equals("target") && (c = c(newPullParser, context)) != null) {
                        ckaVar.put(c.c.b, c);
                    }
                }
            }
            fileInputStream.close();
            return ckaVar;
        } catch (Exception e) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
            return ckaVar;
        }
    }

    public static wia c(XmlPullParser xmlPullParser, Context context) {
        ComponentName unflattenFromString;
        wia wiaVar;
        Intent intent;
        if (xmlPullParser.getName().equals("target")) {
            String a = a(xmlPullParser, "id");
            String a2 = a(xmlPullParser, "short_label");
            if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(a2)) {
                int parseInt = Integer.parseInt(a(xmlPullParser, "rank"));
                String a3 = a(xmlPullParser, "long_label");
                String a4 = a(xmlPullParser, "disabled_message");
                String a5 = a(xmlPullParser, "component");
                if (TextUtils.isEmpty(a5)) {
                    unflattenFromString = null;
                } else {
                    unflattenFromString = ComponentName.unflattenFromString(a5);
                }
                String a6 = a(xmlPullParser, "icon_resource_name");
                String a7 = a(xmlPullParser, "icon_bitmap_path");
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                while (true) {
                    int next = xmlPullParser.next();
                    if (next != 1) {
                        if (next == 2) {
                            String name = xmlPullParser.getName();
                            name.getClass();
                            if (!name.equals("intent")) {
                                if (name.equals("categories")) {
                                    String a8 = a(xmlPullParser, "name");
                                    if (!TextUtils.isEmpty(a8)) {
                                        hashSet.add(a8);
                                    }
                                }
                            } else {
                                String a9 = a(xmlPullParser, "action");
                                String a10 = a(xmlPullParser, "targetPackage");
                                String a11 = a(xmlPullParser, "targetClass");
                                if (a9 == null) {
                                    intent = null;
                                } else {
                                    intent = new Intent(a9);
                                    if (!TextUtils.isEmpty(a10) && !TextUtils.isEmpty(a11)) {
                                        intent.setClassName(a10, a11);
                                    }
                                }
                                if (intent != null) {
                                    arrayList.add(intent);
                                }
                            }
                        } else {
                            wiaVar = null;
                            if (next == 3 && xmlPullParser.getName().equals("target")) {
                                break;
                            }
                        }
                    } else {
                        wiaVar = null;
                        break;
                    }
                }
                ?? obj = new Object();
                obj.a = context;
                obj.b = a;
                obj.e = a2;
                obj.m = parseInt;
                if (!TextUtils.isEmpty(a3)) {
                    obj.f = a3;
                }
                if (!TextUtils.isEmpty(a4)) {
                    obj.g = a4;
                }
                if (unflattenFromString != null) {
                    obj.d = unflattenFromString;
                }
                if (!arrayList.isEmpty()) {
                    obj.c = (Intent[]) arrayList.toArray(new Intent[0]);
                }
                if (!hashSet.isEmpty()) {
                    st stVar = new st(0);
                    stVar.addAll(hashSet);
                    obj.j = stVar;
                }
                if (!TextUtils.isEmpty(obj.e)) {
                    Intent[] intentArr = obj.c;
                    if (intentArr != null && intentArr.length != 0) {
                        return new wia(obj, a6, a7);
                    }
                    u36.j("Shortcut must have an intent");
                    return wiaVar;
                }
                u36.j("Shortcut must have a non-empty label");
                return wiaVar;
            }
            return null;
        }
        return null;
    }

    public static void d(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void e(XmlSerializer xmlSerializer, wia wiaVar) {
        Intent[] intentArr;
        xmlSerializer.startTag(null, "target");
        qia qiaVar = wiaVar.c;
        String str = wiaVar.b;
        String str2 = wiaVar.a;
        d(xmlSerializer, "id", qiaVar.b);
        d(xmlSerializer, "short_label", qiaVar.e.toString());
        d(xmlSerializer, "rank", Integer.toString(qiaVar.m));
        if (!TextUtils.isEmpty(qiaVar.f)) {
            d(xmlSerializer, "long_label", qiaVar.f.toString());
        }
        if (!TextUtils.isEmpty(qiaVar.g)) {
            d(xmlSerializer, "disabled_message", qiaVar.g.toString());
        }
        ComponentName componentName = qiaVar.d;
        if (componentName != null) {
            d(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            d(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            d(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr2 = qiaVar.c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length)) {
            xmlSerializer.startTag(null, "intent");
            d(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                d(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                d(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : qiaVar.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                d(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
