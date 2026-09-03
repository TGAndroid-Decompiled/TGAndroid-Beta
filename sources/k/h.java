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
import j7.r7;
import java.io.IOException;
import l.n;
import m.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class h extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f9517f;
    public final Object[] f9518a;
    public final Object[] f9519b;
    public final Context f9520c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f9517f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f9520c = context;
        Object[] objArr = {context};
        this.f9518a = objArr;
        this.f9519b = objArr;
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
        boolean z4;
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
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                Menu menu2 = gVar.f9495a;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z11 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            gVar.f9496b = 0;
                            gVar.f9497c = 0;
                            gVar.d = 0;
                            gVar.e = 0;
                            gVar.f9498f = true;
                            gVar.f9499g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                n nVar = gVar.f9516z;
                                if (nVar != null && nVar.f11195a.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(menu2.addSubMenu(gVar.f9496b, gVar.f9500i, gVar.f9501j, gVar.f9502k).getItem());
                                } else {
                                    gVar.h = true;
                                    gVar.b(menu2.add(gVar.f9496b, gVar.f9500i, gVar.f9501j, gVar.f9502k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                    }
                    xmlPullParser2 = xmlPullParser;
                    eventType = xmlPullParser2.next();
                    i10 = 2;
                } else {
                    if (!z11) {
                        String name3 = xmlPullParser.getName();
                        boolean equals = name3.equals("group");
                        Context context = this.f9520c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5620p);
                            gVar.f9496b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f9497c = obtainStyledAttributes.getInt(3, 0);
                            gVar.d = obtainStyledAttributes.getInt(4, 0);
                            gVar.e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f9498f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f9499g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f5621q);
                                gVar.f9500i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.f9501j = (obtainStyledAttributes2.getInt(5, gVar.f9497c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                                gVar.f9502k = obtainStyledAttributes2.getText(7);
                                gVar.f9503l = obtainStyledAttributes2.getText(8);
                                gVar.f9504m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f9505n = charAt;
                                gVar.f9506o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f9507p = charAt2;
                                gVar.f9508q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f9509r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f9509r = gVar.e;
                                }
                                gVar.f9510s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f9511t = obtainStyledAttributes2.getBoolean(4, gVar.f9498f);
                                gVar.f9512u = obtainStyledAttributes2.getBoolean(1, gVar.f9499g);
                                gVar.v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f9515y = obtainStyledAttributes2.getString(12);
                                gVar.f9513w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f9514x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 && gVar.f9513w == 0 && gVar.f9514x == null) {
                                    gVar.f9516z = (n) gVar.a(string3, f9517f, this.f9519b);
                                } else {
                                    if (z4) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f9516z = null;
                                }
                                gVar.A = obtainStyledAttributes2.getText(17);
                                gVar.B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    gVar.D = m1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                                } else {
                                    gVar.D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = r7.a(context, resourceId)) == null) {
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
                                SubMenu addSubMenu = menu2.addSubMenu(gVar.f9496b, gVar.f9500i, gVar.f9501j, gVar.f9502k);
                                gVar.b(addSubMenu.getItem());
                                xmlPullParser2 = xmlPullParser;
                                b(xmlPullParser2, attributeSet, addSubMenu);
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = name3;
                                z11 = true;
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
        if (!(menu instanceof l.k)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f9520c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
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
