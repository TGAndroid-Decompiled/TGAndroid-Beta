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
    public static final Class[] f9536f;
    public final Object[] f9537a;
    public final Object[] f9538b;
    public final Context f9539c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f9536f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f9539c = context;
        Object[] objArr = {context};
        this.f9537a = objArr;
        this.f9538b = objArr;
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
                Menu menu2 = gVar.f9514a;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z11 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            gVar.f9515b = 0;
                            gVar.f9516c = 0;
                            gVar.d = 0;
                            gVar.e = 0;
                            gVar.f9517f = true;
                            gVar.f9518g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                n nVar = gVar.f9535z;
                                if (nVar != null && nVar.f11085a.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(menu2.addSubMenu(gVar.f9515b, gVar.f9519i, gVar.f9520j, gVar.f9521k).getItem());
                                } else {
                                    gVar.h = true;
                                    gVar.b(menu2.add(gVar.f9515b, gVar.f9519i, gVar.f9520j, gVar.f9521k));
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
                        Context context = this.f9539c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5631p);
                            gVar.f9515b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f9516c = obtainStyledAttributes.getInt(3, 0);
                            gVar.d = obtainStyledAttributes.getInt(4, 0);
                            gVar.e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f9517f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f9518g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f5632q);
                                gVar.f9519i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.f9520j = (obtainStyledAttributes2.getInt(5, gVar.f9516c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                                gVar.f9521k = obtainStyledAttributes2.getText(7);
                                gVar.f9522l = obtainStyledAttributes2.getText(8);
                                gVar.f9523m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f9524n = charAt;
                                gVar.f9525o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f9526p = charAt2;
                                gVar.f9527q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f9528r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f9528r = gVar.e;
                                }
                                gVar.f9529s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f9530t = obtainStyledAttributes2.getBoolean(4, gVar.f9517f);
                                gVar.f9531u = obtainStyledAttributes2.getBoolean(1, gVar.f9518g);
                                gVar.v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f9534y = obtainStyledAttributes2.getString(12);
                                gVar.f9532w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f9533x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 && gVar.f9532w == 0 && gVar.f9533x == null) {
                                    gVar.f9535z = (n) gVar.a(string3, f9536f, this.f9538b);
                                } else {
                                    if (z4) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f9535z = null;
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
                                SubMenu addSubMenu = menu2.addSubMenu(gVar.f9515b, gVar.f9519i, gVar.f9520j, gVar.f9521k);
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
                    xmlResourceParser = this.f9539c.getResources().getLayout(i10);
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
