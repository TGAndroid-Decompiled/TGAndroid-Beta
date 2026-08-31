package h2;

import a0.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
public abstract class d {
    public static volatile ArrayList f7195a;
    public static final Object f7196b = new Object();

    public static String a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static a0.f c(File file, Context context) {
        h f10;
        ?? kVar = new k(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.exists()) {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(fileInputStream, "UTF_8");
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1) {
                        break;
                    } else if (next == 2 && newPullParser.getName().equals("target") && (f10 = f(newPullParser, context)) != null) {
                        kVar.put(f10.f7207c.f6808b, f10);
                    }
                }
            }
            fileInputStream.close();
            return kVar;
        } catch (Exception e6) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e6);
            return kVar;
        }
    }

    public static c d(XmlResourceParser xmlResourceParser) {
        String a2 = a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next == 2) {
                    String name = xmlResourceParser.getName();
                    name.getClass();
                    if (!name.equals("data")) {
                        if (name.equals("category")) {
                            arrayList2.add(a(xmlResourceParser, "name"));
                        }
                    } else {
                        a(xmlResourceParser, "scheme");
                        a(xmlResourceParser, "host");
                        a(xmlResourceParser, "port");
                        a(xmlResourceParser, "path");
                        a(xmlResourceParser, "pathPattern");
                        a(xmlResourceParser, "pathPrefix");
                        arrayList.add(new b(a(xmlResourceParser, "mimeType")));
                    }
                } else if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                    break;
                }
            } else {
                break;
            }
        }
        if (!arrayList.isEmpty() && a2 != null && !arrayList2.isEmpty()) {
            return new c((b[]) arrayList.toArray(new b[arrayList.size()]), a2, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return null;
    }

    public static ArrayList e(Context context) {
        c d;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                Bundle bundle = activityInfo.metaData;
                if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                    ArrayList arrayList2 = new ArrayList();
                    XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                    if (loadXmlMetaData != null) {
                        while (true) {
                            try {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    break;
                                } else if (next == 2 && loadXmlMetaData.getName().equals("share-target") && (d = d(loadXmlMetaData)) != null) {
                                    arrayList2.add(d);
                                }
                            } catch (Exception e6) {
                                Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e6);
                            }
                        }
                        loadXmlMetaData.close();
                        arrayList.addAll(arrayList2);
                    } else {
                        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
                    }
                }
            }
        }
        return arrayList;
    }

    public static h f(XmlPullParser xmlPullParser, Context context) {
        ComponentName unflattenFromString;
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String b10 = b(xmlPullParser, "id");
        String b11 = b(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(b10) || TextUtils.isEmpty(b11)) {
            return null;
        }
        int parseInt = Integer.parseInt(b(xmlPullParser, "rank"));
        String b12 = b(xmlPullParser, "long_label");
        String b13 = b(xmlPullParser, "disabled_message");
        String b14 = b(xmlPullParser, "component");
        if (TextUtils.isEmpty(b14)) {
            unflattenFromString = null;
        } else {
            unflattenFromString = ComponentName.unflattenFromString(b14);
        }
        String b15 = b(xmlPullParser, "icon_resource_name");
        String b16 = b(xmlPullParser, "icon_bitmap_path");
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
                            String b17 = b(xmlPullParser, "name");
                            if (!TextUtils.isEmpty(b17)) {
                                hashSet.add(b17);
                            }
                        }
                    } else {
                        String b18 = b(xmlPullParser, "action");
                        String b19 = b(xmlPullParser, "targetPackage");
                        String b20 = b(xmlPullParser, "targetClass");
                        if (b18 == null) {
                            intent = null;
                        } else {
                            intent = new Intent(b18);
                            if (!TextUtils.isEmpty(b19) && !TextUtils.isEmpty(b20)) {
                                intent.setClassName(b19, b20);
                            }
                        }
                        if (intent != null) {
                            arrayList.add(intent);
                        }
                    }
                } else if (next == 3 && xmlPullParser.getName().equals("target")) {
                    break;
                }
            } else {
                break;
            }
        }
        ?? obj = new Object();
        obj.f6807a = context;
        obj.f6808b = b10;
        obj.f6810e = b11;
        obj.f6817m = parseInt;
        if (!TextUtils.isEmpty(b12)) {
            obj.f6811f = b12;
        }
        if (!TextUtils.isEmpty(b13)) {
            obj.f6812g = b13;
        }
        if (unflattenFromString != null) {
            obj.d = unflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            obj.f6809c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            a0.g gVar = new a0.g(0);
            gVar.addAll(hashSet);
            obj.f6814j = gVar;
        }
        if (!TextUtils.isEmpty(obj.f6810e)) {
            Intent[] intentArr = obj.f6809c;
            if (intentArr != null && intentArr.length != 0) {
                return new h(obj, b15, b16);
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    public static void g(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void h(XmlSerializer xmlSerializer, h hVar) {
        Intent[] intentArr;
        xmlSerializer.startTag(null, "target");
        g0.c cVar = hVar.f7207c;
        String str = hVar.f7206b;
        String str2 = hVar.f7205a;
        g(xmlSerializer, "id", cVar.f6808b);
        g(xmlSerializer, "short_label", cVar.f6810e.toString());
        g(xmlSerializer, "rank", Integer.toString(cVar.f6817m));
        if (!TextUtils.isEmpty(cVar.f6811f)) {
            g(xmlSerializer, "long_label", cVar.f6811f.toString());
        }
        if (!TextUtils.isEmpty(cVar.f6812g)) {
            g(xmlSerializer, "disabled_message", cVar.f6812g.toString());
        }
        ComponentName componentName = cVar.d;
        if (componentName != null) {
            g(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            g(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            g(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr2 = cVar.f6809c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length)) {
            xmlSerializer.startTag(null, "intent");
            g(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : cVar.f6814j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                g(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
