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
public final class sea extends FrameLayout implements fn7 {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public ux9 H;
    public rea I;
    public final yv3[] a;
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

    public sea(Activity activity, vnb vnbVar) {
        super(activity);
        this.a = new yv3[2];
        this.b = (byte) 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i = 0;
        while (true) {
            yv3[] yv3VarArr = this.a;
            if (i < yv3VarArr.length) {
                yv3VarArr[i] = new yv3(this, activity, vnbVar);
                addView(this.a[i], tre.c(-1.0f, -1));
                i++;
            } else {
                yv3VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(yv3 yv3Var, TLRPC.WebPage webPage, String str) {
        de0 de0Var = (de0) yv3Var.r;
        ((ImageView) yv3Var.c).setImageResource(2131232209);
        ((ImageView) yv3Var.c).setVisibility(0);
        ((FrameLayout) yv3Var.h).setVisibility(8);
        ((ImageView) yv3Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((ema) yv3Var.d).l(str2, false);
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
        ((ema) yv3Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w = xb4.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(webPage.photo.sizes, hl.L(40.0f), false, null, false);
            if (w != null) {
                de0Var.setRoundRadius(hl.L(4.0f));
                de0Var.g(1, 0L, jn5.f(w, webPage.photo), jn5.f(w2, webPage.photo), webPage, "50_50", "50_50_b", null);
                de0Var.setVisibility(0);
            } else {
                de0Var.setVisibility(8);
            }
        } else {
            de0Var.setVisibility(8);
        }
        ((LinearLayout) yv3Var.b).setClickable(false);
    }

    public static void b(de0 de0Var, no6 no6Var) {
        if (no6Var == null) {
            de0Var.setVisibility(8);
            return;
        }
        int i = no6Var.C;
        String str = no6Var.I;
        de0Var.setVisibility(0);
        de0Var.q();
        String str2 = no6Var.c;
        if (str2 != null) {
            de0Var.o(str2, null, null);
        } else if (str != null) {
            if (no6Var.b) {
                de0Var.o(dze.d("vthumb://", i, ":", str), null, null);
                return;
            }
            de0Var.r(no6Var.J, no6Var.K, true);
            de0Var.o("thumb://" + i + ":" + str, null, null);
        } else {
            de0Var.setImageDrawable(null);
        }
    }

    public final String c(yv3 yv3Var) {
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
                sb.append(ob6.M0(2131745629, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.c;
                if (size2 == 1) {
                    r = wf3.k(i2, longValue);
                } else {
                    r = wf3.r(i2, longValue);
                }
                sb.append(r);
            }
        }
        String a0 = ob6.a0(null, null, 2131745167, sb.toString());
        ema emaVar = (ema) yv3Var.e;
        if (emaVar.getMeasuredWidth() <= 0) {
            measuredWidth = hl.q.x - hl.L(140.0f);
        } else {
            measuredWidth = emaVar.getMeasuredWidth();
        }
        float f = measuredWidth;
        if (arrayList.size() <= 2 && emaVar.getPaint().measureText(a0) <= f) {
            return a0;
        }
        return ob6.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(k5.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i == jn7.w0 && this.x != null && i2 == this.c) {
            zh6 zh6Var = (zh6) objArr[0];
            for (int i3 = 0; i3 < zh6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) zh6Var.n(i3);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = (byte) 0;
                            rea reaVar = this.I;
                            if (reaVar != null) {
                                ((xg3) reaVar).g(0);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sea.e(java.lang.CharSequence, boolean):void");
    }

    public final de0 f(int i) {
        de0[] de0VarArr;
        if (this.b == 1 && (de0VarArr = (de0[]) this.a[0].n) != null && i >= 0 && i < de0VarArr.length && de0VarArr[i].getVisibility() == 0) {
            return de0VarArr[i];
        }
        return null;
    }

    public final void g(int i) {
        h(i);
        this.d = yac.h(k5.a(i).a).e();
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
        int i3 = jn7.w0;
        if (i2 == i) {
            this.c = i;
            if (isAttachedToWindow()) {
                jn7.f(this.c).b(this, i3);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            jn7.f(this.c).n(this, i3);
        }
        this.c = i;
        if (isAttachedToWindow()) {
            jn7.f(this.c).b(this, i3);
        }
    }

    public final void i(int i, ArrayList arrayList) {
        boolean z;
        rea reaVar;
        no6 no6Var;
        no6 no6Var2;
        int i2;
        h(i);
        this.d = yac.h(k5.a(i).a).e();
        this.e = arrayList;
        this.h = false;
        no6 no6Var3 = null;
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
        yv3[] yv3VarArr = this.a;
        yv3 yv3Var = yv3VarArr[0];
        ema emaVar = (ema) yv3Var.e;
        de0[] de0VarArr = (de0[]) yv3Var.n;
        ema emaVar2 = (ema) yv3Var.d;
        ((ImageView) yv3Var.c).setImageResource(2131231114);
        ((ImageView) yv3Var.c).setVisibility(0);
        ((de0) yv3Var.r).setVisibility(8);
        ((FrameLayout) yv3Var.h).setVisibility(0);
        ((ImageView) yv3Var.s).setVisibility(8);
        ((LinearLayout) yv3Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                if (((no6) obj).b) {
                    i3++;
                } else {
                    i4++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((no6) arrayList2.get(0)).b) {
                    i2 = 2131745161;
                } else {
                    i2 = 2131745172;
                }
                emaVar2.l(ob6.M0(i2, null), false);
            } else if (i3 == 0) {
                emaVar2.l(ob6.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i4 == 0) {
                emaVar2.l(ob6.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                emaVar2.l(ob6.G(size2, "ShareSendItems", new Object[0]), false);
            }
            emaVar.l(c(yv3Var), false);
            de0 de0Var = de0VarArr[0];
            if (arrayList2.size() > 0) {
                no6Var = (no6) arrayList2.get(0);
            } else {
                no6Var = null;
            }
            b(de0Var, no6Var);
            de0 de0Var2 = de0VarArr[1];
            if (arrayList2.size() > 1) {
                no6Var2 = (no6) arrayList2.get(1);
            } else {
                no6Var2 = null;
            }
            b(de0Var2, no6Var2);
            de0 de0Var3 = de0VarArr[2];
            if (arrayList2.size() > 2) {
                no6Var3 = (no6) arrayList2.get(2);
            }
            b(de0Var3, no6Var3);
        } else {
            emaVar2.l("", false);
            emaVar.l("", false);
            for (de0 de0Var4 : de0VarArr) {
                de0Var4.setVisibility(8);
            }
        }
        yv3 yv3Var2 = yv3VarArr[0];
        String str = this.G;
        if (str != null) {
            ((ema) yv3Var2.f).l(str, false);
        }
        byte b2 = this.b;
        if (b != b2 && (reaVar = this.I) != null) {
            ((xg3) reaVar).g(b2);
        }
    }

    public final void j() {
        yv3[] yv3VarArr;
        ux9 ux9Var = this.H;
        if (ux9Var != null) {
            hl.r(ux9Var);
            this.H = null;
        }
        this.F = false;
        for (yv3 yv3Var : this.a) {
            ema emaVar = (ema) yv3Var.e;
            emaVar.setAlpha(1.0f);
            emaVar.setScaleX(1.0f);
            emaVar.setScaleY(1.0f);
            ((ema) yv3Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        yv3[] yv3VarArr = this.a;
        yv3 yv3Var = yv3VarArr[0];
        yv3 yv3Var2 = yv3VarArr[1];
        yv3VarArr[0] = yv3Var2;
        yv3VarArr[1] = yv3Var;
        yv3Var2.getClass();
        yv3VarArr[0].setVisibility(0);
        yv3VarArr[0].setScaleX(0.8f);
        yv3VarArr[0].setScaleY(0.8f);
        yv3VarArr[0].setAlpha(0.0f);
        yv3VarArr[0].setTranslationY(hl.L(20.0f));
        ViewPropertyAnimator translationY = yv3VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 320L);
        yv3 yv3Var3 = yv3VarArr[1];
        yv3Var3.getClass();
        yv3Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-hl.L(20.0f)).setInterpolator(k43Var).setDuration(320L).withEndAction(new ux9(yv3Var3, (byte) 19)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.c).b(this, jn7.w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.c).n(this, jn7.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (yv3 yv3Var : this.a) {
            ((LinearLayout) yv3Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(rea reaVar) {
        this.I = reaVar;
    }
}
