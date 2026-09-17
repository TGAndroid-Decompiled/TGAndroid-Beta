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
import v7.u7;
public final class h extends MenuInflater {
    public static final Class[] f14419e;
    public static final Class[] f14420f;
    public final Object[] f14421a;
    public final Object[] f14422b;
    public final Context f14423c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f14419e = clsArr;
        f14420f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f14423c = context;
        Object[] objArr = {context};
        this.f14421a = objArr;
        this.f14422b = objArr;
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
                Menu menu2 = gVar.f14396a;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z12 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            gVar.f14397b = 0;
                            gVar.f14398c = 0;
                            gVar.d = 0;
                            gVar.f14399e = 0;
                            gVar.f14400f = true;
                            gVar.f14401g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                o oVar = gVar.f14418z;
                                if (oVar != null && oVar.f15157a.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(menu2.addSubMenu(gVar.f14397b, gVar.f14402i, gVar.f14403j, gVar.f14404k).getItem());
                                } else {
                                    gVar.h = true;
                                    gVar.b(menu2.add(gVar.f14397b, gVar.f14402i, gVar.f14403j, gVar.f14404k));
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
                        Context context = this.f14423c;
                        if (equals) {
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f9150p);
                            gVar.f14397b = obtainStyledAttributes.getResourceId(1, 0);
                            gVar.f14398c = obtainStyledAttributes.getInt(3, 0);
                            gVar.d = obtainStyledAttributes.getInt(4, 0);
                            gVar.f14399e = obtainStyledAttributes.getInt(5, 0);
                            gVar.f14400f = obtainStyledAttributes.getBoolean(2, true);
                            gVar.f14401g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f9151q);
                                gVar.f14402i = obtainStyledAttributes2.getResourceId(2, 0);
                                gVar.f14403j = (obtainStyledAttributes2.getInt(5, gVar.f14398c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                                gVar.f14404k = obtainStyledAttributes2.getText(7);
                                gVar.f14405l = obtainStyledAttributes2.getText(8);
                                gVar.f14406m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                gVar.f14407n = charAt;
                                gVar.f14408o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                gVar.f14409p = charAt2;
                                gVar.f14410q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    gVar.f14411r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    gVar.f14411r = gVar.f14399e;
                                }
                                gVar.f14412s = obtainStyledAttributes2.getBoolean(3, false);
                                gVar.f14413t = obtainStyledAttributes2.getBoolean(4, gVar.f14400f);
                                gVar.f14414u = obtainStyledAttributes2.getBoolean(1, gVar.f14401g);
                                gVar.v = obtainStyledAttributes2.getInt(21, -1);
                                gVar.f14417y = obtainStyledAttributes2.getString(12);
                                gVar.f14415w = obtainStyledAttributes2.getResourceId(13, 0);
                                gVar.f14416x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && gVar.f14415w == 0 && gVar.f14416x == null) {
                                    gVar.f14418z = (o) gVar.a(string3, f14420f, this.f14422b);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    gVar.f14418z = null;
                                }
                                gVar.A = obtainStyledAttributes2.getText(17);
                                gVar.B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    gVar.D = l1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                                } else {
                                    gVar.D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = u7.a(context, resourceId)) == null) {
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
                                SubMenu addSubMenu = menu2.addSubMenu(gVar.f14397b, gVar.f14402i, gVar.f14403j, gVar.f14404k);
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
                    xmlResourceParser = this.f14423c.getResources().getLayout(i10);
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
