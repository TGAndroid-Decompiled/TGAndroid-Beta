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
import g7.o7;
import java.io.IOException;
import l.o;
import m.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class h extends MenuInflater {

    public static final Class[] f14243e;

    public static final Class[] f14244f;

    public final Object[] f14245a;

    public final Object[] f14246b;

    public final Context f14247c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f14243e = clsArr;
        f14244f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f14247c = context;
        Object[] objArr = {context};
        this.f14245a = objArr;
        this.f14246b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i10) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z11 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f14221b = 0;
                            gVar.f14222c = 0;
                            gVar.d = 0;
                            gVar.f14223e = 0;
                            gVar.f14224f = true;
                            gVar.f14225g = true;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                o oVar = gVar.f14242z;
                                if (oVar == null || !oVar.f15357a.hasSubMenu()) {
                                    gVar.h = true;
                                    gVar.b(gVar.f14220a.add(gVar.f14221b, gVar.f14226i, gVar.f14227j, gVar.f14228k));
                                } else {
                                    gVar.h = true;
                                    gVar.b(gVar.f14220a.addSubMenu(gVar.f14221b, gVar.f14226i, gVar.f14227j, gVar.f14228k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z10 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                    }
                }
            } else if (z11) {
                xmlPullParser2 = xmlPullParser;
            } else {
                String name3 = xmlPullParser.getName();
                boolean zEquals = name3.equals("group");
                Context context = this.f14247c;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f5587p);
                    gVar.f14221b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    gVar.f14222c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    gVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    gVar.f14223e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    gVar.f14224f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    gVar.f14225g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    xmlPullParser2 = xmlPullParser;
                } else if (name3.equals("item")) {
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f5588q);
                    gVar.f14226i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                    gVar.f14227j = (typedArrayObtainStyledAttributes2.getInt(5, gVar.f14222c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                    gVar.f14228k = typedArrayObtainStyledAttributes2.getText(7);
                    gVar.f14229l = typedArrayObtainStyledAttributes2.getText(8);
                    gVar.f14230m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(9);
                    gVar.f14231n = string == null ? (char) 0 : string.charAt(0);
                    gVar.f14232o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(10);
                    gVar.f14233p = string2 == null ? (char) 0 : string2.charAt(0);
                    gVar.f14234q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                        gVar.f14235r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        gVar.f14235r = gVar.f14223e;
                    }
                    gVar.f14236s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                    gVar.f14237t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f14224f);
                    gVar.f14238u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f14225g);
                    gVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                    gVar.f14241y = typedArrayObtainStyledAttributes2.getString(12);
                    gVar.f14239w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                    gVar.f14240x = typedArrayObtainStyledAttributes2.getString(15);
                    String string3 = typedArrayObtainStyledAttributes2.getString(14);
                    boolean z12 = string3 != null;
                    if (z12 && gVar.f14239w == 0 && gVar.f14240x == null) {
                        gVar.f14242z = (o) gVar.a(string3, f14244f, this.f14246b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        gVar.f14242z = null;
                    }
                    gVar.A = typedArrayObtainStyledAttributes2.getText(17);
                    gVar.B = typedArrayObtainStyledAttributes2.getText(22);
                    if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                        gVar.D = m1.b(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.D);
                    } else {
                        gVar.D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                        if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = o7.a(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                        }
                        gVar.C = colorStateList;
                    } else {
                        gVar.C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    gVar.h = false;
                    xmlPullParser2 = xmlPullParser;
                } else if (name3.equals("menu")) {
                    gVar.h = true;
                    SubMenu subMenuAddSubMenu = gVar.f14220a.addSubMenu(gVar.f14221b, gVar.f14226i, gVar.f14227j, gVar.f14228k);
                    gVar.b(subMenuAddSubMenu.getItem());
                    xmlPullParser2 = xmlPullParser;
                    b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlPullParser2 = xmlPullParser;
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser2.next();
            i10 = 2;
        }
    }

    @Override
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof l.l)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f14247c.getResources().getLayout(i10);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e9) {
                    throw new InflateException("Error inflating menu XML", e9);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
