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
public final class bda extends FrameLayout implements jm7 {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public c0a H;
    public ada I;
    public final pw3[] a;
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

    public bda(Activity activity, ylb ylbVar) {
        super(activity);
        this.a = new pw3[2];
        this.b = (byte) 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i = 0;
        while (true) {
            pw3[] pw3VarArr = this.a;
            if (i < pw3VarArr.length) {
                pw3VarArr[i] = new pw3(this, activity, ylbVar);
                addView(this.a[i], qoe.c(-1.0f, -1));
                i++;
            } else {
                pw3VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(pw3 pw3Var, TLRPC.WebPage webPage, String str) {
        bf0 bf0Var = (bf0) pw3Var.r;
        ((ImageView) pw3Var.c).setImageResource(2131232210);
        ((ImageView) pw3Var.c).setVisibility(0);
        ((FrameLayout) pw3Var.h).setVisibility(8);
        ((ImageView) pw3Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((lka) pw3Var.d).l(str2, false);
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
        ((lka) pw3Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w = bc4.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(webPage.photo.sizes, gm.L(40.0f), false, null, false);
            if (w != null) {
                bf0Var.setRoundRadius(gm.L(4.0f));
                bf0Var.g(1, 0L, gn5.f(w, webPage.photo), gn5.f(w2, webPage.photo), webPage, "50_50", "50_50_b", null);
                bf0Var.setVisibility(0);
            } else {
                bf0Var.setVisibility(8);
            }
        } else {
            bf0Var.setVisibility(8);
        }
        ((LinearLayout) pw3Var.b).setClickable(false);
    }

    public static void b(bf0 bf0Var, jo6 jo6Var) {
        if (jo6Var == null) {
            bf0Var.setVisibility(8);
            return;
        }
        int i = jo6Var.C;
        String str = jo6Var.I;
        bf0Var.setVisibility(0);
        bf0Var.q();
        String str2 = jo6Var.c;
        if (str2 != null) {
            bf0Var.o(str2, null, null);
        } else if (str != null) {
            if (jo6Var.b) {
                bf0Var.o(mle.d("vthumb://", i, ":", str), null, null);
                return;
            }
            bf0Var.r(jo6Var.J, jo6Var.K, true);
            bf0Var.o("thumb://" + i + ":" + str, null, null);
        } else {
            bf0Var.setImageDrawable(null);
        }
    }

    public final String c(pw3 pw3Var) {
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
                sb.append(jb6.M0(2131745635, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.c;
                if (size2 == 1) {
                    r = pg3.k(i2, longValue);
                } else {
                    r = pg3.r(i2, longValue);
                }
                sb.append(r);
            }
        }
        String a0 = jb6.a0(null, null, 2131745173, sb.toString());
        lka lkaVar = (lka) pw3Var.e;
        if (lkaVar.getMeasuredWidth() <= 0) {
            measuredWidth = gm.q.x - gm.L(140.0f);
        } else {
            measuredWidth = lkaVar.getMeasuredWidth();
        }
        float f = measuredWidth;
        if (arrayList.size() <= 2 && lkaVar.getPaint().measureText(a0) <= f) {
            return a0;
        }
        return jb6.G(arrayList.size(), "ShareSendToMany", new Object[0]);
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
        if (i == nm7.w0 && this.x != null && i2 == this.c) {
            vh6 vh6Var = (vh6) objArr[0];
            for (int i3 = 0; i3 < vh6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vh6Var.n(i3);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = (byte) 0;
                            ada adaVar = this.I;
                            if (adaVar != null) {
                                ((nh3) adaVar).f(0);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bda.e(java.lang.CharSequence, boolean):void");
    }

    public final bf0 f(int i) {
        bf0[] bf0VarArr;
        if (this.b == 1 && (bf0VarArr = (bf0[]) this.a[0].n) != null && i >= 0 && i < bf0VarArr.length && bf0VarArr[i].getVisibility() == 0) {
            return bf0VarArr[i];
        }
        return null;
    }

    public final void g(int i) {
        h(i);
        this.d = z8c.h(j5.a(i).a).e();
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
        int i3 = nm7.w0;
        if (i2 == i) {
            this.c = i;
            if (isAttachedToWindow()) {
                nm7.f(this.c).b(this, i3);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            nm7.f(this.c).n(this, i3);
        }
        this.c = i;
        if (isAttachedToWindow()) {
            nm7.f(this.c).b(this, i3);
        }
    }

    public final void i(int i, ArrayList arrayList) {
        boolean z;
        ada adaVar;
        jo6 jo6Var;
        jo6 jo6Var2;
        int i2;
        h(i);
        this.d = z8c.h(j5.a(i).a).e();
        this.e = arrayList;
        this.h = false;
        jo6 jo6Var3 = null;
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
        pw3[] pw3VarArr = this.a;
        pw3 pw3Var = pw3VarArr[0];
        lka lkaVar = (lka) pw3Var.e;
        bf0[] bf0VarArr = (bf0[]) pw3Var.n;
        lka lkaVar2 = (lka) pw3Var.d;
        ((ImageView) pw3Var.c).setImageResource(2131231115);
        ((ImageView) pw3Var.c).setVisibility(0);
        ((bf0) pw3Var.r).setVisibility(8);
        ((FrameLayout) pw3Var.h).setVisibility(0);
        ((ImageView) pw3Var.s).setVisibility(8);
        ((LinearLayout) pw3Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                if (((jo6) obj).b) {
                    i3++;
                } else {
                    i4++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((jo6) arrayList2.get(0)).b) {
                    i2 = 2131745167;
                } else {
                    i2 = 2131745178;
                }
                lkaVar2.l(jb6.M0(i2, null), false);
            } else if (i3 == 0) {
                lkaVar2.l(jb6.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i4 == 0) {
                lkaVar2.l(jb6.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                lkaVar2.l(jb6.G(size2, "ShareSendItems", new Object[0]), false);
            }
            lkaVar.l(c(pw3Var), false);
            bf0 bf0Var = bf0VarArr[0];
            if (arrayList2.size() > 0) {
                jo6Var = (jo6) arrayList2.get(0);
            } else {
                jo6Var = null;
            }
            b(bf0Var, jo6Var);
            bf0 bf0Var2 = bf0VarArr[1];
            if (arrayList2.size() > 1) {
                jo6Var2 = (jo6) arrayList2.get(1);
            } else {
                jo6Var2 = null;
            }
            b(bf0Var2, jo6Var2);
            bf0 bf0Var3 = bf0VarArr[2];
            if (arrayList2.size() > 2) {
                jo6Var3 = (jo6) arrayList2.get(2);
            }
            b(bf0Var3, jo6Var3);
        } else {
            lkaVar2.l("", false);
            lkaVar.l("", false);
            for (bf0 bf0Var4 : bf0VarArr) {
                bf0Var4.setVisibility(8);
            }
        }
        pw3 pw3Var2 = pw3VarArr[0];
        String str = this.G;
        if (str != null) {
            ((lka) pw3Var2.f).l(str, false);
        }
        byte b2 = this.b;
        if (b != b2 && (adaVar = this.I) != null) {
            ((nh3) adaVar).f(b2);
        }
    }

    public final void j() {
        pw3[] pw3VarArr;
        c0a c0aVar = this.H;
        if (c0aVar != null) {
            gm.r(c0aVar);
            this.H = null;
        }
        this.F = false;
        for (pw3 pw3Var : this.a) {
            lka lkaVar = (lka) pw3Var.e;
            lkaVar.setAlpha(1.0f);
            lkaVar.setScaleX(1.0f);
            lkaVar.setScaleY(1.0f);
            ((lka) pw3Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        pw3[] pw3VarArr = this.a;
        pw3 pw3Var = pw3VarArr[0];
        pw3 pw3Var2 = pw3VarArr[1];
        pw3VarArr[0] = pw3Var2;
        pw3VarArr[1] = pw3Var;
        pw3Var2.getClass();
        pw3VarArr[0].setVisibility(0);
        pw3VarArr[0].setScaleX(0.8f);
        pw3VarArr[0].setScaleY(0.8f);
        pw3VarArr[0].setAlpha(0.0f);
        pw3VarArr[0].setTranslationY(gm.L(20.0f));
        ViewPropertyAnimator translationY = pw3VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        d53 d53Var = d53.h;
        wi8.t(translationY, d53Var, 320L);
        pw3 pw3Var3 = pw3VarArr[1];
        pw3Var3.getClass();
        pw3Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-gm.L(20.0f)).setInterpolator(d53Var).setDuration(320L).withEndAction(new c0a(pw3Var3, (byte) 11)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.c).b(this, nm7.w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.c).n(this, nm7.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (pw3 pw3Var : this.a) {
            ((LinearLayout) pw3Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(ada adaVar) {
        this.I = adaVar;
    }
}
