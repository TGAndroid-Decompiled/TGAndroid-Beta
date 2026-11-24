package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class bba extends FrameLayout implements gk7 {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public z6a H;
    public aba I;
    public final ev3[] a;
    public byte b;
    public int c;
    public long d;
    public ArrayList e;
    public final ArrayList f;
    public boolean h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final HashMap w;
    public TLRPC.WebPage x;
    public int y;

    public bba(Activity activity, wjb wjbVar) {
        super(activity);
        this.a = new ev3[2];
        this.b = (byte) 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i = 0;
        while (true) {
            ev3[] ev3VarArr = this.a;
            if (i < ev3VarArr.length) {
                ev3VarArr[i] = new ev3(this, activity, wjbVar);
                addView(this.a[i], nme.c(-1.0f, -1));
                i++;
            } else {
                ev3VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(ev3 ev3Var, TLRPC.WebPage webPage, String str) {
        be0 be0Var = (be0) ev3Var.r;
        ((ImageView) ev3Var.c).setImageResource(2131232209);
        ((ImageView) ev3Var.c).setVisibility(0);
        ((FrameLayout) ev3Var.h).setVisibility(8);
        ((ImageView) ev3Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((jia) ev3Var.d).l(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null) {
            String str4 = webPage.display_url;
            if (str4 != null) {
                str = str4;
            }
            str3 = str;
        }
        ((jia) ev3Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w = ba4.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(webPage.photo.sizes, gl.L(40.0f), false, null, false);
            if (w != null) {
                be0Var.setRoundRadius(gl.L(4.0f));
                be0Var.g(1, 0L, gl5.f(w, webPage.photo), gl5.f(w2, webPage.photo), webPage, "50_50", "50_50_b", null);
                be0Var.setVisibility(0);
            } else {
                be0Var.setVisibility(8);
            }
        } else {
            be0Var.setVisibility(8);
        }
        ((LinearLayout) ev3Var.b).setClickable(false);
    }

    public static void b(be0 be0Var, jm6 jm6Var) {
        if (jm6Var == null) {
            be0Var.setVisibility(8);
            return;
        }
        int i = jm6Var.C;
        String str = jm6Var.I;
        be0Var.setVisibility(0);
        be0Var.q();
        String str2 = jm6Var.c;
        if (str2 != null) {
            be0Var.o(str2, null, null);
        } else if (str != null) {
            if (jm6Var.b) {
                be0Var.o(mue.d("vthumb://", i, ":", str), null, null);
                return;
            }
            be0Var.r(jm6Var.J, jm6Var.K, true);
            be0Var.o("thumb://" + i + ":" + str, null, null);
        } else {
            be0Var.setImageDrawable(null);
        }
    }

    public final String c(ev3 ev3Var) {
        int measuredWidth;
        String r;
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == this.d) {
                sb.append(k96.M0(2131745709, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.c;
                if (size2 == 1) {
                    r = cf3.k(i2, longValue);
                } else {
                    r = cf3.r(i2, longValue);
                }
                sb.append(r);
            }
        }
        String a0 = k96.a0(null, null, 2131745247, sb.toString());
        jia jiaVar = (jia) ev3Var.e;
        if (jiaVar.getMeasuredWidth() <= 0) {
            measuredWidth = gl.q.x - gl.L(140.0f);
        } else {
            measuredWidth = jiaVar.getMeasuredWidth();
        }
        float f = measuredWidth;
        if (arrayList.size() <= 2 && jiaVar.getPaint().measureText(a0) <= f) {
            return a0;
        }
        return k96.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(j5.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i == kk7.v0 && this.x != null && i2 == this.c) {
            vf6 vf6Var = (vf6) objArr[0];
            for (int i3 = 0; i3 < vf6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vf6Var.n(i3);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = (byte) 0;
                            aba abaVar = this.I;
                            if (abaVar != null) {
                                ((ag3) abaVar).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.x = webPage;
                        ArrayList arrayList = this.s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.e(java.lang.CharSequence, boolean):void");
    }

    public final be0 f(int i) {
        be0[] be0VarArr;
        if (this.b == 1 && (be0VarArr = (be0[]) this.a[0].n) != null && i >= 0 && i < be0VarArr.length && be0VarArr[i].getVisibility() == 0) {
            return be0VarArr[i];
        }
        return null;
    }

    public final void g(int i) {
        h(i);
        this.d = y6c.h(j5.a(i).a).e();
        this.e = null;
        this.h = true;
        this.n = true;
        this.r = null;
        this.x = null;
        d();
        this.s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.x;
    }

    public int getMode() {
        return this.b;
    }

    public final void h(int i) {
        int i2 = this.c;
        int i3 = kk7.v0;
        if (i2 == i) {
            this.c = i;
            if (isAttachedToWindow()) {
                kk7.f(this.c).b(this, i3);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            kk7.f(this.c).n(this, i3);
        }
        this.c = i;
        if (isAttachedToWindow()) {
            kk7.f(this.c).b(this, i3);
        }
    }

    public final void i(int i, ArrayList arrayList) {
        boolean z;
        aba abaVar;
        jm6 jm6Var;
        jm6 jm6Var2;
        int i2;
        h(i);
        this.d = y6c.h(j5.a(i).a).e();
        this.e = arrayList;
        this.h = false;
        jm6 jm6Var3 = null;
        this.x = null;
        d();
        this.s.clear();
        byte b = this.b;
        if (b != 1 && b != 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = (byte) 1;
        if (z) {
            k();
        }
        ev3[] ev3VarArr = this.a;
        ev3 ev3Var = ev3VarArr[0];
        jia jiaVar = (jia) ev3Var.e;
        be0[] be0VarArr = (be0[]) ev3Var.n;
        jia jiaVar2 = (jia) ev3Var.d;
        ((ImageView) ev3Var.c).setImageResource(2131231114);
        ((ImageView) ev3Var.c).setVisibility(0);
        ((be0) ev3Var.r).setVisibility(8);
        ((FrameLayout) ev3Var.h).setVisibility(0);
        ((ImageView) ev3Var.s).setVisibility(8);
        ((LinearLayout) ev3Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                if (((jm6) obj).b) {
                    i3++;
                } else {
                    i4++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((jm6) arrayList2.get(0)).b) {
                    i2 = 2131745241;
                } else {
                    i2 = 2131745252;
                }
                jiaVar2.l(k96.M0(i2, null), false);
            } else if (i3 == 0) {
                jiaVar2.l(k96.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i4 == 0) {
                jiaVar2.l(k96.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                jiaVar2.l(k96.G(size2, "ShareSendItems", new Object[0]), false);
            }
            jiaVar.l(c(ev3Var), false);
            be0 be0Var = be0VarArr[0];
            if (arrayList2.size() > 0) {
                jm6Var = (jm6) arrayList2.get(0);
            } else {
                jm6Var = null;
            }
            b(be0Var, jm6Var);
            be0 be0Var2 = be0VarArr[1];
            if (arrayList2.size() > 1) {
                jm6Var2 = (jm6) arrayList2.get(1);
            } else {
                jm6Var2 = null;
            }
            b(be0Var2, jm6Var2);
            be0 be0Var3 = be0VarArr[2];
            if (arrayList2.size() > 2) {
                jm6Var3 = (jm6) arrayList2.get(2);
            }
            b(be0Var3, jm6Var3);
        } else {
            jiaVar2.l("", false);
            jiaVar.l("", false);
            for (be0 be0Var4 : be0VarArr) {
                be0Var4.setVisibility(8);
            }
        }
        ev3 ev3Var2 = ev3VarArr[0];
        String str = this.G;
        if (str != null) {
            ((jia) ev3Var2.f).l(str, false);
        }
        byte b2 = this.b;
        if (b != b2 && (abaVar = this.I) != null) {
            ((ag3) abaVar).g(b2);
        }
    }

    public final void j() {
        ev3[] ev3VarArr;
        z6a z6aVar = this.H;
        if (z6aVar != null) {
            gl.r(z6aVar);
            this.H = null;
        }
        this.F = false;
        for (ev3 ev3Var : this.a) {
            jia jiaVar = (jia) ev3Var.e;
            jiaVar.setAlpha(1.0f);
            jiaVar.setScaleX(1.0f);
            jiaVar.setScaleY(1.0f);
            ((jia) ev3Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        ev3[] ev3VarArr = this.a;
        ev3 ev3Var = ev3VarArr[0];
        ev3 ev3Var2 = ev3VarArr[1];
        ev3VarArr[0] = ev3Var2;
        ev3VarArr[1] = ev3Var;
        ev3Var2.getClass();
        ev3VarArr[0].setVisibility(0);
        ev3VarArr[0].setScaleX(0.8f);
        ev3VarArr[0].setScaleY(0.8f);
        ev3VarArr[0].setAlpha(0.0f);
        ev3VarArr[0].setTranslationY(gl.L(20.0f));
        ViewPropertyAnimator translationY = ev3VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        s33 s33Var = s33.h;
        ug8.t(translationY, s33Var, 320L);
        ev3 ev3Var3 = ev3VarArr[1];
        ev3Var3.getClass();
        ev3Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-gl.L(20.0f)).setInterpolator(s33Var).setDuration(320L).withEndAction(new z6a(ev3Var3, (byte) 3)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.c).b(this, kk7.v0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.c).n(this, kk7.v0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (ev3 ev3Var : this.a) {
            ((LinearLayout) ev3Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(aba abaVar) {
        this.I = abaVar;
    }
}
