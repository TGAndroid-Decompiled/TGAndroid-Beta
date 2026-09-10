package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import l.o;
import m.l1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.v7;
public final class h extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f11984f;
    public final Object[] f11985a;
    public final Object[] f11986b;
    public final Context f11987c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f11984f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f11987c = context;
        Object[] objArr = {context};
        this.f11985a = objArr;
        this.f11986b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        XmlPullParser xmlPullParser2;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                Menu menu2 = gVar.f11962a;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z12 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            gVar.f11963b = 0;
                            gVar.f11964c = 0;
                            gVar.d = 0;
                            gVar.e = 0;
                            gVar.f11965f = true;
                            gVar.f11966g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                o oVar = gVar.f11983z;
                                if (oVar != null && oVar.f12673a.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(menu2.addSubMenu(gVar.f11963b, gVar.f11967i, gVar.f11968j, gVar.f11969k).getItem());
                                } else {
                                    gVar.h = true;
                                    gVar.b(menu2.add(gVar.f11963b, gVar.f11967i, gVar.f11968j, gVar.f11969k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z11 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                    }
                    xmlPullParser2 = xmlPullParser;
                    eventType = xmlPullParser2.next();
                    i10 = 2;
                } else {
                    if (!z12) {
                        String name3 = xmlPullParser.getName();
                        boolean equals = name3.equals("group");
                        Context context = this.f11987c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f7657p);
                            gVar.f11963b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f11964c = obtainStyledAttributes.getInt(3, 0);
                            gVar.d = obtainStyledAttributes.getInt(4, 0);
                            gVar.e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f11965f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f11966g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f7658q);
                                gVar.f11967i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.f11968j = (obtainStyledAttributes2.getInt(5, gVar.f11964c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                                gVar.f11969k = obtainStyledAttributes2.getText(7);
                                gVar.f11970l = obtainStyledAttributes2.getText(8);
                                gVar.f11971m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f11972n = charAt;
                                gVar.f11973o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f11974p = charAt2;
                                gVar.f11975q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f11976r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f11976r = gVar.e;
                                }
                                gVar.f11977s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f11978t = obtainStyledAttributes2.getBoolean(4, gVar.f11965f);
                                gVar.f11979u = obtainStyledAttributes2.getBoolean(1, gVar.f11966g);
                                gVar.v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f11982y = obtainStyledAttributes2.getString(12);
                                gVar.f11980w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f11981x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && gVar.f11980w == 0 && gVar.f11981x == null) {
                                    gVar.f11983z = (o) gVar.a(string3, f11984f, this.f11986b);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f11983z = null;
                                }
                                gVar.A = obtainStyledAttributes2.getText(17);
                                gVar.B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    gVar.D = l1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                                } else {
                                    gVar.D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = v7.a(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    gVar.C = colorStateList;
                                } else {
                                    gVar.C = null;
                                }
                                obtainStyledAttributes2.recycle();
                                gVar.h = false;
                                xmlPullParser2 = xmlPullParser;
                            } else if (name3.equals("menu")) {
                                gVar.h = true;
                                SubMenu addSubMenu = menu2.addSubMenu(gVar.f11963b, gVar.f11967i, gVar.f11968j, gVar.f11969k);
                                gVar.b(addSubMenu.getItem());
                                xmlPullParser2 = xmlPullParser;
                                b(xmlPullParser2, attributeSet, addSubMenu);
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlPullParser2.next();
                            i10 = 2;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    eventType = xmlPullParser2.next();
                    i10 = 2;
                }
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof l.l)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11987c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
