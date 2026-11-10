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
import l.n;
import m.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class h extends MenuInflater {
    public static final Class[] f17142e;
    public static final Class[] f17143f;
    public final Object[] f17144a;
    public final Object[] f17145b;
    public final Context f17146c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f17142e = clsArr;
        f17143f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f17146c = context;
        Object[] objArr = {context};
        this.f17144a = objArr;
        this.f17145b = objArr;
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
        int i7;
        XmlPullParser xmlPullParser2;
        char charAt;
        char charAt2;
        boolean z9;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i7 = 2;
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
                Menu menu2 = gVar.f17119a;
                if (eventType != i7) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z11 = false;
                            str = null;
                            eventType = xmlPullParser2.next();
                            i7 = 2;
                            z10 = z10;
                            z11 = z11;
                        } else if (name2.equals("group")) {
                            gVar.f17120b = 0;
                            gVar.f17121c = 0;
                            gVar.d = 0;
                            gVar.f17122e = 0;
                            gVar.f17123f = true;
                            gVar.f17124g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                n nVar = gVar.f17141z;
                                if (nVar != null && nVar.f17721a.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(menu2.addSubMenu(gVar.f17120b, gVar.f17125i, gVar.f17126j, gVar.f17127k).getItem());
                                } else {
                                    gVar.h = true;
                                    gVar.b(menu2.add(gVar.f17120b, gVar.f17125i, gVar.f17126j, gVar.f17127k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z10 = true;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    z10 = z10;
                } else {
                    if (!z11) {
                        String name3 = xmlPullParser.getName();
                        boolean equals = name3.equals("group");
                        Context context = this.f17146c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f10873p);
                            gVar.f17120b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f17121c = obtainStyledAttributes.getInt(3, 0);
                            gVar.d = obtainStyledAttributes.getInt(4, 0);
                            gVar.f17122e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f17123f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f17124g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f10874q);
                                gVar.f17125i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.f17126j = (obtainStyledAttributes2.getInt(5, gVar.f17121c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                                gVar.f17127k = obtainStyledAttributes2.getText(7);
                                gVar.f17128l = obtainStyledAttributes2.getText(8);
                                gVar.f17129m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f17130n = charAt;
                                gVar.f17131o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f17132p = charAt2;
                                gVar.f17133q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f17134r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f17134r = gVar.f17122e;
                                }
                                gVar.f17135s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f17136t = obtainStyledAttributes2.getBoolean(4, gVar.f17123f);
                                gVar.f17137u = obtainStyledAttributes2.getBoolean(1, gVar.f17124g);
                                gVar.v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f17140y = obtainStyledAttributes2.getString(12);
                                gVar.f17138w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f17139x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9 && gVar.f17138w == 0 && gVar.f17139x == null) {
                                    gVar.f17141z = (n) gVar.a(string3, f17143f, this.f17145b);
                                } else {
                                    if (z9) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f17141z = null;
                                }
                                gVar.A = obtainStyledAttributes2.getText(17);
                                gVar.B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    gVar.D = m1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                                } else {
                                    gVar.D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = b5.a.a(context, resourceId)) == null) {
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
                                SubMenu addSubMenu = menu2.addSubMenu(gVar.f17120b, gVar.f17125i, gVar.f17126j, gVar.f17127k);
                                gVar.b(addSubMenu.getItem());
                                xmlPullParser2 = xmlPullParser;
                                b(xmlPullParser2, attributeSet, addSubMenu);
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = name3;
                                z11 = true;
                            }
                            eventType = xmlPullParser2.next();
                            i7 = 2;
                            z10 = z10;
                            z11 = z11;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    z10 = z10;
                }
                eventType = xmlPullParser2.next();
                i7 = 2;
                z10 = z10;
                z11 = z11;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override
    public final void inflate(int i7, Menu menu) {
        if (!(menu instanceof l.k)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f17146c.getResources().getLayout(i7);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
