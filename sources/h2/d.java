package h2;

import a0.g;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public abstract class d {

    public static volatile ArrayList f7754a;

    public static final Object f7755b = new Object();

    public static String a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static a0.f c(File file, Context context) {
        f fVarF;
        a0.f fVar = new a0.f(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (file.exists()) {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2 && xmlPullParserNewPullParser.getName().equals("target") && (fVarF = f(xmlPullParserNewPullParser, context)) != null) {
                            fVar.put(fVarF.f7761c.f6332b, fVarF);
                        }
                        file.delete();
                        Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
                        return fVar;
                    }
                }
                fileInputStream.close();
                return fVar;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e9) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e9);
            return fVar;
        }
    }

    public static c d(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        String strA = a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                        break;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    name.getClass();
                    if (name.equals("data")) {
                        a(xmlResourceParser, "scheme");
                        a(xmlResourceParser, "host");
                        a(xmlResourceParser, "port");
                        a(xmlResourceParser, "path");
                        a(xmlResourceParser, "pathPattern");
                        a(xmlResourceParser, "pathPrefix");
                        arrayList.add(new b(a(xmlResourceParser, "mimeType")));
                    } else if (name.equals("category")) {
                        arrayList2.add(a(xmlResourceParser, "name"));
                    }
                }
            } else {
                break;
            }
        }
        if (arrayList.isEmpty() || strA == null || arrayList2.isEmpty()) {
            return null;
        }
        return new c((b[]) arrayList.toArray(new b[arrayList.size()]), strA, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    public static ArrayList e(Context context) {
        c cVarD;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                Bundle bundle = activityInfo.metaData;
                if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                    ArrayList arrayList2 = new ArrayList();
                    XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                    if (xmlResourceParserLoadXmlMetaData == null) {
                        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
                    }
                    while (true) {
                        try {
                            int next = xmlResourceParserLoadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2 && xmlResourceParserLoadXmlMetaData.getName().equals("share-target") && (cVarD = d(xmlResourceParserLoadXmlMetaData)) != null) {
                                arrayList2.add(cVarD);
                            }
                        } catch (Exception e9) {
                            Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e9);
                        }
                    }
                    xmlResourceParserLoadXmlMetaData.close();
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static f f(XmlPullParser xmlPullParser, Context context) throws XmlPullParserException, IOException {
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String strB = b(xmlPullParser, "id");
        String strB2 = b(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strB2)) {
            return null;
        }
        int i10 = Integer.parseInt(b(xmlPullParser, "rank"));
        String strB3 = b(xmlPullParser, "long_label");
        String strB4 = b(xmlPullParser, "disabled_message");
        String strB5 = b(xmlPullParser, "component");
        ComponentName componentNameUnflattenFromString = TextUtils.isEmpty(strB5) ? null : ComponentName.unflattenFromString(strB5);
        String strB6 = b(xmlPullParser, "icon_resource_name");
        String strB7 = b(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getName().equals("target")) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (name.equals("intent")) {
                        String strB8 = b(xmlPullParser, "action");
                        String strB9 = b(xmlPullParser, "targetPackage");
                        String strB10 = b(xmlPullParser, "targetClass");
                        if (strB8 == null) {
                            intent = null;
                        } else {
                            intent = new Intent(strB8);
                            if (!TextUtils.isEmpty(strB9) && !TextUtils.isEmpty(strB10)) {
                                intent.setClassName(strB9, strB10);
                            }
                        }
                        if (intent != null) {
                            arrayList.add(intent);
                        }
                    } else if (name.equals("categories")) {
                        String strB11 = b(xmlPullParser, "name");
                        if (!TextUtils.isEmpty(strB11)) {
                            hashSet.add(strB11);
                        }
                    }
                }
            } else {
                break;
            }
        }
        g0.c cVar = new g0.c();
        cVar.f6331a = context;
        cVar.f6332b = strB;
        cVar.f6334e = strB2;
        cVar.f6341m = i10;
        if (!TextUtils.isEmpty(strB3)) {
            cVar.f6335f = strB3;
        }
        if (!TextUtils.isEmpty(strB4)) {
            cVar.f6336g = strB4;
        }
        if (componentNameUnflattenFromString != null) {
            cVar.d = componentNameUnflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            cVar.f6333c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            g gVar = new g(0);
            gVar.addAll(hashSet);
            cVar.f6338j = gVar;
        }
        if (TextUtils.isEmpty(cVar.f6334e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = cVar.f6333c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return new f(cVar, strB6, strB7);
    }

    public static void g(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void h(XmlSerializer xmlSerializer, f fVar) {
        xmlSerializer.startTag(null, "target");
        g0.c cVar = fVar.f7761c;
        String str = fVar.f7760b;
        String str2 = fVar.f7759a;
        g(xmlSerializer, "id", cVar.f6332b);
        g(xmlSerializer, "short_label", cVar.f6334e.toString());
        g(xmlSerializer, "rank", Integer.toString(cVar.f6341m));
        if (!TextUtils.isEmpty(cVar.f6335f)) {
            g(xmlSerializer, "long_label", cVar.f6335f.toString());
        }
        if (!TextUtils.isEmpty(cVar.f6336g)) {
            g(xmlSerializer, "disabled_message", cVar.f6336g.toString());
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
        Intent[] intentArr = cVar.f6333c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            xmlSerializer.startTag(null, "intent");
            g(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : cVar.f6338j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                g(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
