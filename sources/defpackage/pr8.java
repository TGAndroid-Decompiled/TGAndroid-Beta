package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
public final class pr8 extends d implements gk7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout a;
    public int a0;
    public o39 b;
    public boolean b0;
    public nr8 c;
    public boolean c0;
    public AnimatorSet d;
    public final wjb e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public or8 s;
    public o72 w;
    public int x;
    public int y;

    public pr8(Bundle bundle, wjb wjbVar) {
        super(bundle);
        this.e = wjbVar;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        long j = this.f;
        long j2 = this.h;
        String p = im7.p(j, j2, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new mr8(this, p));
        wjb wjbVar = this.e;
        o72 o72Var = new o72(context, null, false, wjbVar);
        this.w = o72Var;
        o72Var.setOccupyStatusBar(!gl.O1());
        if (j < 0) {
            if (j2 != 0) {
                TLRPC.TL_forumTopic f = getMessagesController().g4.f(-j, j2);
                mm4.q(this.w.getAvatarImageView(), f, false, true, wjbVar);
                this.simpleActionBar.setTitle(f.title);
            } else {
                TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                this.w.setChatAvatar(K0);
                this.simpleActionBar.setTitle(K0.title);
            }
        } else {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
            if (V1 != null) {
                this.w.setUserAvatar(V1);
                this.simpleActionBar.setTitle(qu2.m(0, V1.first_name, V1.last_name));
            }
        }
        pha phaVar = this.simpleActionBar;
        if (this.n) {
            phaVar.setSubtitle(k96.M0(2131747702, null));
            this.simpleActionBar.s(k96.M0(2131745754, null));
        } else {
            phaVar.setSubtitle(k96.M0(2131751672, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        o39 o39Var2 = this.b;
        nr8 nr8Var = new nr8(this, context);
        this.c = nr8Var;
        o39Var2.setAdapter(nr8Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new zr((byte) 14));
        this.b.setOnItemClickListener(new ir((gk7) this, context, (Object) p, (byte) 3));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.e0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final wjb getResourceProvider() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 7);
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.b, 0, new Class[]{u6c.class}, new String[]{"statusColor"}, (Drawable[]) null, o92Var, bkb.x6));
        arrayList.add(new blb(this.b, 0, new Class[]{u6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void l0(String str) {
        this.c0 = true;
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        finishFragment();
        or8 or8Var = this.s;
        if (or8Var != null) {
            or8Var.n();
        }
    }

    public final void m0(int i, int i2, String str) {
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i);
        putInt.putInt("smart_delay_" + str, i2).apply();
        nr8 nr8Var = this.c;
        if (nr8Var != null) {
            nr8Var.g(this.J);
        }
    }

    public final void n0(Context context, String str, View view, int i) {
        String str2;
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        String str3;
        if (view.isEnabled()) {
            int i2 = this.Y;
            wjb wjbVar = this.e;
            Parcelable parcelable = null;
            if (i == i2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M0 = k96.M0(2131745909, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745910, null);
                alertDialog$Builder.j(k96.M0(2131745925, null), new kr8(this, str));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                }
            } else if (i == this.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f);
                bundle.putLong("topic_id", this.h);
                presentFragment(new an7(bundle, wjbVar));
            } else if (i == this.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    if (uri != null) {
                        str2 = uri.getPath();
                    } else {
                        str2 = null;
                    }
                    String string = sharedPreferences.getString("ringtone_path_" + str, str2);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(str2) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    startActivityForResult(intent, 13);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else if (i == this.I) {
                Activity parentActivity = getParentActivity();
                Runnable runnable = new Runnable(this) {
                    public final pr8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        pr8 pr8Var = this.b;
                        switch (b) {
                            case 0:
                                nr8 nr8Var = pr8Var.c;
                                if (nr8Var != null) {
                                    nr8Var.g(pr8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                nr8 nr8Var2 = pr8Var.c;
                                if (nr8Var2 != null) {
                                    nr8Var2.g(pr8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                nr8 nr8Var3 = pr8Var.c;
                                if (nr8Var3 != null) {
                                    nr8Var3.g(pr8Var.K);
                                    return;
                                }
                                return;
                            default:
                                nr8 nr8Var4 = pr8Var.c;
                                if (nr8Var4 != null) {
                                    nr8Var4.g(pr8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                Pattern pattern = ij.a;
                long j = this.f;
                if (j != 0) {
                    str3 = ls6.n(j, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                showDialog(ij.V(parentActivity, j, this.h, str3, runnable, this.e));
            } else if (i == this.F) {
                ahb ahbVar = (ahb) view;
                boolean z = !ahbVar.e.h;
                this.r = z;
                ahbVar.setChecked(z);
                int childCount = this.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < childCount; i3++) {
                    y29 y29Var = (y29) this.b.T(this.b.getChildAt(i3));
                    int i4 = y29Var.f;
                    View view2 = y29Var.a;
                    int b = y29Var.b();
                    if (b != this.F && b != this.Y) {
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != 4) {
                                            if (i4 == 7 && b == this.G) {
                                                ((ahb) view2).e(arrayList, this.r);
                                            }
                                        } else {
                                            ((vy8) view2).b(arrayList, this.r);
                                        }
                                    } else {
                                        ((chb) view2).a(arrayList, this.r);
                                    }
                                } else {
                                    ((mhb) view2).c(arrayList, this.r);
                                }
                            } else {
                                ((uib) view2).a(arrayList, this.r);
                            }
                        } else {
                            ((ld5) view2).a(arrayList, this.r);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AnimatorSet animatorSet = this.d;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.d = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.d.addListener(new l48(this, (byte) 23));
                    this.d.setDuration(150L);
                    this.d.start();
                }
            } else if (i == this.G) {
                ahb ahbVar2 = (ahb) view;
                Switch r3 = ahbVar2.e;
                na7.q1(this.currentAccount).W3.edit().putBoolean(b00.h("content_preview_", str), !r3.h).apply();
                ahbVar2.setChecked(!r3.h);
            } else if (i == this.T) {
                showDialog(ij.V(getParentActivity(), this.f, this.h, b00.h("calls_vibrate_", str), new Runnable(this) {
                    public final pr8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b2 = r2;
                        pr8 pr8Var = this.b;
                        switch (b2) {
                            case 0:
                                nr8 nr8Var = pr8Var.c;
                                if (nr8Var != null) {
                                    nr8Var.g(pr8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                nr8 nr8Var2 = pr8Var.c;
                                if (nr8Var2 != null) {
                                    nr8Var2.g(pr8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                nr8 nr8Var3 = pr8Var.c;
                                if (nr8Var3 != null) {
                                    nr8Var3.g(pr8Var.K);
                                    return;
                                }
                                return;
                            default:
                                nr8 nr8Var4 = pr8Var.c;
                                if (nr8Var4 != null) {
                                    nr8Var4.g(pr8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                }, this.e));
            } else if (i == this.K) {
                showDialog(ij.F(getParentActivity(), this.f, this.h, -1, new Runnable(this) {
                    public final pr8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b2 = r2;
                        pr8 pr8Var = this.b;
                        switch (b2) {
                            case 0:
                                nr8 nr8Var = pr8Var.c;
                                if (nr8Var != null) {
                                    nr8Var.g(pr8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                nr8 nr8Var2 = pr8Var.c;
                                if (nr8Var2 != null) {
                                    nr8Var2.g(pr8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                nr8 nr8Var3 = pr8Var.c;
                                if (nr8Var3 != null) {
                                    nr8Var3.g(pr8Var.K);
                                    return;
                                }
                                return;
                            default:
                                nr8 nr8Var4 = pr8Var.c;
                                if (nr8Var4 != null) {
                                    nr8Var4.g(pr8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                }, this.e));
            } else if (i == this.J) {
                if (getParentActivity() != null) {
                    SharedPreferences sharedPreferences2 = na7.q1(this.currentAccount).W3;
                    int g = ls6.g("smart_max_count_", str, sharedPreferences2, 2);
                    int g2 = ls6.g("smart_delay_", str, sharedPreferences2, 180);
                    if (g == 0) {
                        g = 2;
                    }
                    Activity parentActivity2 = getParentActivity();
                    kr8 kr8Var = new kr8(this, str);
                    Pattern pattern2 = ij.a;
                    if (parentActivity2 != null) {
                        int i5 = bkb.i5;
                        if (wjbVar != null) {
                            w0 = wjbVar.f(i5);
                            w02 = wjbVar.f(bkb.g5);
                            wjbVar.f(bkb.zj);
                            wjbVar.f(bkb.Dj);
                            wjbVar.f(bkb.D8);
                            wjbVar.f(bkb.F8);
                            wjbVar.f(bkb.h6);
                            w03 = wjbVar.f(bkb.Ii);
                            w04 = wjbVar.f(bkb.Ei);
                            w05 = wjbVar.f(bkb.Gi);
                        } else {
                            w0 = bkb.w0(null, i5, false);
                            w02 = bkb.w0(null, bkb.g5, false);
                            bkb.w0(null, bkb.zj, false);
                            bkb.w0(null, bkb.Dj, false);
                            bkb.w0(null, bkb.D8, false);
                            bkb.w0(null, bkb.F8, false);
                            bkb.w0(null, bkb.h6, false);
                            w03 = bkb.w0(null, bkb.Ii, false);
                            w04 = bkb.w0(null, bkb.Ei, false);
                            w05 = bkb.w0(null, bkb.Gi, false);
                        }
                        int i6 = w04;
                        int i7 = w05;
                        i4d i4dVar = new i4d(parentActivity2, wjbVar);
                        Object obj = i4dVar.a;
                        ((fx0) obj).w0 = false;
                        int i8 = w03;
                        hn7 hn7Var = new hn7(parentActivity2, wjbVar);
                        hn7Var.setMinValue(0);
                        hn7Var.setMaxValue(10);
                        hn7Var.setTextColor(w0);
                        hn7Var.setValue(g - 1);
                        hn7Var.setWrapSelectorWheel(false);
                        hn7Var.setFormatter(new zf((byte) 1));
                        hn7 hn7Var2 = new hn7(parentActivity2, wjbVar);
                        hn7Var2.setMinValue(0);
                        hn7Var2.setMaxValue(10);
                        hn7Var2.setTextColor(w0);
                        hn7Var2.setValue((g2 / 60) - 1);
                        hn7Var2.setWrapSelectorWheel(false);
                        hn7Var2.setFormatter(new zf((byte) 2));
                        hn7 hn7Var3 = new hn7(parentActivity2, wjbVar);
                        hn7Var3.setMinValue(0);
                        hn7Var3.setMaxValue(0);
                        hn7Var3.setTextColor(w0);
                        hn7Var3.setValue(0);
                        hn7Var3.setWrapSelectorWheel(false);
                        hn7Var3.setFormatter(new zf((byte) 3));
                        zh zhVar = new zh(parentActivity2, hn7Var, hn7Var2, hn7Var3, (byte) 5);
                        zhVar.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(parentActivity2);
                        zhVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity2);
                        textView2.setText(k96.M0(2131747928, null));
                        textView2.setTextColor(w0);
                        ir2.t(textView2, 1, 20.0f);
                        frameLayout.addView(textView2, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new p8((byte) 6));
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        wb wbVar = new wb(parentActivity2, (byte) 5);
                        linearLayout.addView(hn7Var, nme.l(0.4f, 0, 270));
                        linearLayout.addView(hn7Var3, nme.p(0, -2, 0.2f, 16));
                        linearLayout.addView(hn7Var2, nme.l(0.4f, 0, 270));
                        wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                        wbVar.setGravity(17);
                        wbVar.setTextColor(i8);
                        wbVar.setTextSize(1, 14.0f);
                        wbVar.setTypeface(gl.o());
                        int L = gl.L(8.0f);
                        wbVar.setBackgroundDrawable(bkb.i0(L, L, L, L, i6, i7, i7));
                        wbVar.setText(k96.M0(2131753863, null));
                        zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
                        c cVar = new c((byte) 17);
                        hn7Var.setOnValueChangedListener(cVar);
                        hn7Var2.setOnValueChangedListener(cVar);
                        wbVar.setOnClickListener(new ee(hn7Var, hn7Var2, kr8Var, i4dVar, (byte) 1));
                        fx0 fx0Var = (fx0) obj;
                        fx0Var.O = zhVar;
                        fx0Var.show();
                        fx0Var.s0(w02);
                        fx0Var.L(w02);
                    }
                }
            } else if (i == this.W) {
                if (getParentActivity() != null) {
                    showDialog(ij.t(getParentActivity(), this.f, this.h, -1, new Runnable(this) {
                        public final pr8 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r2;
                            pr8 pr8Var = this.b;
                            switch (b2) {
                                case 0:
                                    nr8 nr8Var = pr8Var.c;
                                    if (nr8Var != null) {
                                        nr8Var.g(pr8Var.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    nr8 nr8Var2 = pr8Var.c;
                                    if (nr8Var2 != null) {
                                        nr8Var2.g(pr8Var.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    nr8 nr8Var3 = pr8Var.c;
                                    if (nr8Var3 != null) {
                                        nr8Var3.g(pr8Var.K);
                                        return;
                                    }
                                    return;
                                default:
                                    nr8 nr8Var4 = pr8Var.c;
                                    if (nr8Var4 != null) {
                                        nr8Var4.g(pr8Var.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, this.e));
                }
            } else if (i == this.N) {
                na7.q1(this.currentAccount).W3.edit().putInt("popup_" + str, 1).apply();
                ((vy8) view).a(true, true);
                View findViewWithTag = this.b.findViewWithTag(2);
                if (findViewWithTag != null) {
                    ((vy8) findViewWithTag).a(false, true);
                }
            } else if (i == this.O) {
                na7.q1(this.currentAccount).W3.edit().putInt("popup_" + str, 2).apply();
                ((vy8) view).a(true, true);
                View findViewWithTag2 = this.b.findViewWithTag(1);
                if (findViewWithTag2 != null) {
                    ((vy8) findViewWithTag2).a(false, true);
                }
            } else if (i == this.Q) {
                ahb ahbVar3 = (ahb) view;
                boolean z2 = ahbVar3.e.h;
                boolean z3 = !z2;
                ahbVar3.setChecked(z3);
                SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
                if (this.b0 && !z2) {
                    edit.remove("stories_" + str);
                } else {
                    edit.putBoolean("stories_" + str, z3);
                }
                edit.apply();
                getNotificationsController().c0(this.f, this.h, true);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        int i3;
        Ringtone ringtone;
        if (i2 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str = null;
            if (uri != null && (ringtone = RingtoneManager.getRingtone(a.b, uri)) != null) {
                if (i == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = k96.M0(2131751587, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = k96.M0(2131745088, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
            String p = im7.p(this.f, this.h, false);
            if (i == 12) {
                if (str != null) {
                    edit.putString("sound_" + p, str);
                    edit.putString("sound_path_" + p, uri.toString());
                } else {
                    edit.putString("sound_" + p, "NoSound");
                    edit.putString("sound_path_" + p, "NoSound");
                }
                getNotificationsController().f(this.f, this.h);
            } else if (i == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + p, str);
                    edit.putString("ringtone_path_" + p, uri.toString());
                } else {
                    edit.putString("ringtone_" + p, "NoSound");
                    edit.putString("ringtone_path_" + p, "NoSound");
                }
            }
            edit.apply();
            nr8 nr8Var = this.c;
            if (nr8Var != null) {
                if (i == 13) {
                    i3 = this.S;
                } else {
                    i3 = this.H;
                }
                nr8Var.g(i3);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr8.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String p = im7.p(this.f, this.h, false);
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
            edit.putBoolean("custom_" + p, true).apply();
        }
        kk7.f(this.currentAccount).n(this, kk7.e0);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        gl.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(42.0f)) / 2) + this.mSystemInsets.b, gl.L(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gl.B2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, nme.e(42, 42, 53));
        }
        gl.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(42.0f)) / 2) + this.mSystemInsets.b, gl.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
