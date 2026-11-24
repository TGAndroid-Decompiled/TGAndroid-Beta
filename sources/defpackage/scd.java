package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public abstract class scd {
    public static volatile ArrayList a;
    public static final Object b = new Object();

    public static String a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    public static zaa b(XmlResourceParser xmlResourceParser) {
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
                        arrayList.add(new yaa(a(xmlResourceParser, "mimeType")));
                    }
                } else if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                    break;
                }
            } else {
                break;
            }
        }
        if (!arrayList.isEmpty() && a2 != null && !arrayList2.isEmpty()) {
            return new zaa((yaa[]) arrayList.toArray(new yaa[arrayList.size()]), a2, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return null;
    }

    public static ArrayList c(Context context) {
        zaa b2;
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
                                } else if (next == 2 && loadXmlMetaData.getName().equals("share-target") && (b2 = b(loadXmlMetaData)) != null) {
                                    arrayList2.add(b2);
                                }
                            } catch (Exception e) {
                                Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                            }
                        }
                        loadXmlMetaData.close();
                        arrayList.addAll(arrayList2);
                    } else {
                        k32.e(activityInfo.name, "Failed to open android.app.shortcuts meta-data resource of ");
                        return null;
                    }
                }
            }
        }
        return arrayList;
    }
}
