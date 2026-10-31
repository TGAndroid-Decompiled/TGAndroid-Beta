package jg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.oj0;
import w7.b6;
public final class z0 extends j {
    public final y0 f10381q0;
    public boolean f10382r0;
    public int f10383s0;
    public int f10384t0;
    public TLRPC.MessageMedia f10385u0;
    public TL_stories.MediaArea f10386v0;

    public z0(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f7, int i11) {
        super(context, pointF);
        y0 y0Var = new y0(context, f7);
        this.f10381q0 = y0Var;
        y0Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        y0Var.e(0, this.f10383s0);
        addView(y0Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        String str;
        String str2;
        String str3;
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String str4 = "";
        String p5 = a1.g.p(new StringBuilder(""), (int) floor, "°");
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder t10 = a1.g.t(p5);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        t10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        t10.append(str2);
        String p9 = a1.g.p(t10, (int) floor2, "'");
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder t11 = a1.g.t(p9);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        t11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        t11.append(str4);
        return a1.g.p(t11, (int) floor3, "\"");
    }

    @Override
    public final i a() {
        return new u0(this, getContext());
    }

    public int getColor() {
        return this.f10383s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = z20.x(L, 2.0f, getPositionX(), scaleX);
        return new oj0(x10, z20.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f10381q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f10381q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f10381q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f10381q0.J;
    }

    public int getType() {
        return this.f10384t0;
    }

    public int getTypesCount() {
        return this.f10381q0.getTypesCount() - (!this.f10382r0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void r(int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.f10385u0 = messageMedia;
        this.f10386v0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(q(d10));
            if (d10 > 0.0d) {
                str3 = "E";
            } else {
                str3 = "W";
            }
            sb2.append(str3);
            str = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str4 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        y0 y0Var = this.f10381q0;
        y0Var.d(i10, str4);
        y0Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.f10382r0 = true;
        this.f10383s0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f10381q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f10384t0 = i10;
        this.f10381q0.e(i10, this.f10383s0);
    }
}
