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
public abstract class wye {
    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static qs b(File file, Context context) {
        nka c;
        ?? vlaVar = new vla(0);
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
                        vlaVar.put(c.c.b, c);
                    }
                }
            }
            fileInputStream.close();
            return vlaVar;
        } catch (Exception e) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
            return vlaVar;
        }
    }

    public static nka c(XmlPullParser xmlPullParser, Context context) {
        ComponentName unflattenFromString;
        nka nkaVar;
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
                            nkaVar = null;
                            if (next == 3 && xmlPullParser.getName().equals("target")) {
                                break;
                            }
                        }
                    } else {
                        nkaVar = null;
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
                    ss ssVar = new ss(0);
                    ssVar.addAll(hashSet);
                    obj.j = ssVar;
                }
                if (!TextUtils.isEmpty(obj.e)) {
                    Intent[] intentArr = obj.c;
                    if (intentArr != null && intentArr.length != 0) {
                        return new nka(obj, a6, a7);
                    }
                    lq5.j("Shortcut must have an intent");
                    return nkaVar;
                }
                lq5.j("Shortcut must have a non-empty label");
                return nkaVar;
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

    public static void e(XmlSerializer xmlSerializer, nka nkaVar) {
        Intent[] intentArr;
        xmlSerializer.startTag(null, "target");
        hka hkaVar = nkaVar.c;
        String str = nkaVar.b;
        String str2 = nkaVar.a;
        d(xmlSerializer, "id", hkaVar.b);
        d(xmlSerializer, "short_label", hkaVar.e.toString());
        d(xmlSerializer, "rank", Integer.toString(hkaVar.m));
        if (!TextUtils.isEmpty(hkaVar.f)) {
            d(xmlSerializer, "long_label", hkaVar.f.toString());
        }
        if (!TextUtils.isEmpty(hkaVar.g)) {
            d(xmlSerializer, "disabled_message", hkaVar.g.toString());
        }
        ComponentName componentName = hkaVar.d;
        if (componentName != null) {
            d(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            d(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            d(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr2 = hkaVar.c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length)) {
            xmlSerializer.startTag(null, "intent");
            d(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                d(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                d(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : hkaVar.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                d(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
