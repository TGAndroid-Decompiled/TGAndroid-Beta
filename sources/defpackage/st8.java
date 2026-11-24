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
public final class st8 extends d implements jm7 {
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
    public r59 b;
    public boolean b0;
    public qt8 c;
    public boolean c0;
    public AnimatorSet d;
    public final ylb e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public rt8 s;
    public z82 w;
    public int x;
    public int y;

    public st8(Bundle bundle, ylb ylbVar) {
        super(bundle);
        this.e = ylbVar;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        long j = this.f;
        long j2 = this.h;
        String p = lo7.p(j, j2, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt8(this, p));
        ylb ylbVar = this.e;
        z82 z82Var = new z82(context, null, false, ylbVar);
        this.w = z82Var;
        z82Var.setOccupyStatusBar(!gm.O1());
        if (j < 0) {
            if (j2 != 0) {
                TLRPC.TL_forumTopic f = getMessagesController().g4.f(-j, j2);
                no4.q(this.w.getAvatarImageView(), f, false, true, ylbVar);
                this.simpleActionBar.setTitle(f.title);
            } else {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                this.w.setChatAvatar(L0);
                this.simpleActionBar.setTitle(L0.title);
            }
        } else {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
            if (W1 != null) {
                this.w.setUserAvatar(W1);
                this.simpleActionBar.setTitle(bw2.m(0, W1.first_name, W1.last_name));
            }
        }
        rja rjaVar = this.simpleActionBar;
        if (this.n) {
            rjaVar.setSubtitle(jb6.M0(2131747628, null));
            this.simpleActionBar.s(jb6.M0(2131745680, null));
        } else {
            rjaVar.setSubtitle(jb6.M0(2131751621, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        r59 r59Var2 = this.b;
        qt8 qt8Var = new qt8(this, context);
        this.c = qt8Var;
        r59Var2.setAdapter(qt8Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new zs((byte) 14));
        this.b.setOnItemClickListener(new is((jm7) this, context, (Object) p, (byte) 3));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ylb getResourceProvider() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 7);
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.b, 0, new Class[]{v8c.class}, new String[]{"statusColor"}, (Drawable[]) null, za2Var, cmb.x6));
        arrayList.add(new cnb(this.b, 0, new Class[]{v8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0(String str) {
        this.c0 = true;
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        finishFragment();
        rt8 rt8Var = this.s;
        if (rt8Var != null) {
            rt8Var.v();
        }
    }

    public final void n0(int i, int i2, String str) {
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i);
        putInt.putInt("smart_delay_" + str, i2).apply();
        qt8 qt8Var = this.c;
        if (qt8Var != null) {
            qt8Var.g(this.J);
        }
    }

    public final void o0(Context context, String str, View view, int i) {
        String str2;
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        String str3;
        if (view.isEnabled()) {
            int i2 = this.Y;
            ylb ylbVar = this.e;
            Parcelable parcelable = null;
            if (i == i2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M0 = jb6.M0(2131745835, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745836, null);
                alertDialog$Builder.j(jb6.M0(2131745851, null), new nt8(this, str));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            } else if (i == this.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f);
                bundle.putLong("topic_id", this.h);
                presentFragment(new ep7(bundle, ylbVar));
            } else if (i == this.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
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
                    fc4.g(e, true);
                }
            } else if (i == this.I) {
                Activity parentActivity = getParentActivity();
                Runnable runnable = new Runnable(this) {
                    public final st8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        st8 st8Var = this.b;
                        switch (b) {
                            case 0:
                                qt8 qt8Var = st8Var.c;
                                if (qt8Var != null) {
                                    qt8Var.g(st8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                qt8 qt8Var2 = st8Var.c;
                                if (qt8Var2 != null) {
                                    qt8Var2.g(st8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                qt8 qt8Var3 = st8Var.c;
                                if (qt8Var3 != null) {
                                    qt8Var3.g(st8Var.K);
                                    return;
                                }
                                return;
                            default:
                                qt8 qt8Var4 = st8Var.c;
                                if (qt8Var4 != null) {
                                    qt8Var4.g(st8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                Pattern pattern = ik.a;
                long j = this.f;
                if (j != 0) {
                    str3 = kt6.n(j, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                showDialog(ik.V(parentActivity, j, this.h, str3, runnable, this.e));
            } else if (i == this.F) {
                bjb bjbVar = (bjb) view;
                boolean z = !bjbVar.e.h;
                this.r = z;
                bjbVar.setChecked(z);
                int childCount = this.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < childCount; i3++) {
                    b59 b59Var = (b59) this.b.T(this.b.getChildAt(i3));
                    int i4 = b59Var.f;
                    View view2 = b59Var.a;
                    int b = b59Var.b();
                    if (b != this.F && b != this.Y) {
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != 4) {
                                            if (i4 == 7 && b == this.G) {
                                                ((bjb) view2).e(arrayList, this.r);
                                            }
                                        } else {
                                            ((w09) view2).b(arrayList, this.r);
                                        }
                                    } else {
                                        ((djb) view2).a(arrayList, this.r);
                                    }
                                } else {
                                    ((njb) view2).c(arrayList, this.r);
                                }
                            } else {
                                ((vkb) view2).a(arrayList, this.r);
                            }
                        } else {
                            ((jf5) view2).a(arrayList, this.r);
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
                    this.d.addListener(new s38(this, (byte) 25));
                    this.d.setDuration(150L);
                    this.d.start();
                }
            } else if (i == this.G) {
                bjb bjbVar2 = (bjb) view;
                Switch r3 = bjbVar2.e;
                oc7.r1(this.currentAccount).W3.edit().putBoolean(b10.h("content_preview_", str), !r3.h).apply();
                bjbVar2.setChecked(!r3.h);
            } else if (i == this.T) {
                showDialog(ik.V(getParentActivity(), this.f, this.h, b10.h("calls_vibrate_", str), new Runnable(this) {
                    public final st8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b2 = r2;
                        st8 st8Var = this.b;
                        switch (b2) {
                            case 0:
                                qt8 qt8Var = st8Var.c;
                                if (qt8Var != null) {
                                    qt8Var.g(st8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                qt8 qt8Var2 = st8Var.c;
                                if (qt8Var2 != null) {
                                    qt8Var2.g(st8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                qt8 qt8Var3 = st8Var.c;
                                if (qt8Var3 != null) {
                                    qt8Var3.g(st8Var.K);
                                    return;
                                }
                                return;
                            default:
                                qt8 qt8Var4 = st8Var.c;
                                if (qt8Var4 != null) {
                                    qt8Var4.g(st8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                }, this.e));
            } else if (i == this.K) {
                showDialog(ik.F(getParentActivity(), this.f, this.h, -1, new Runnable(this) {
                    public final st8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b2 = r2;
                        st8 st8Var = this.b;
                        switch (b2) {
                            case 0:
                                qt8 qt8Var = st8Var.c;
                                if (qt8Var != null) {
                                    qt8Var.g(st8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                qt8 qt8Var2 = st8Var.c;
                                if (qt8Var2 != null) {
                                    qt8Var2.g(st8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                qt8 qt8Var3 = st8Var.c;
                                if (qt8Var3 != null) {
                                    qt8Var3.g(st8Var.K);
                                    return;
                                }
                                return;
                            default:
                                qt8 qt8Var4 = st8Var.c;
                                if (qt8Var4 != null) {
                                    qt8Var4.g(st8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                }, this.e));
            } else if (i == this.J) {
                if (getParentActivity() != null) {
                    SharedPreferences sharedPreferences2 = oc7.r1(this.currentAccount).W3;
                    int g = kt6.g("smart_max_count_", str, sharedPreferences2, 2);
                    int g2 = kt6.g("smart_delay_", str, sharedPreferences2, 180);
                    if (g == 0) {
                        g = 2;
                    }
                    Activity parentActivity2 = getParentActivity();
                    nt8 nt8Var = new nt8(this, str);
                    Pattern pattern2 = ik.a;
                    if (parentActivity2 != null) {
                        int i5 = cmb.i5;
                        if (ylbVar != null) {
                            w0 = ylbVar.f(i5);
                            w02 = ylbVar.f(cmb.g5);
                            ylbVar.f(cmb.zj);
                            ylbVar.f(cmb.Dj);
                            ylbVar.f(cmb.D8);
                            ylbVar.f(cmb.F8);
                            ylbVar.f(cmb.h6);
                            w03 = ylbVar.f(cmb.Ii);
                            w04 = ylbVar.f(cmb.Ei);
                            w05 = ylbVar.f(cmb.Gi);
                        } else {
                            w0 = cmb.w0(null, i5, false);
                            w02 = cmb.w0(null, cmb.g5, false);
                            cmb.w0(null, cmb.zj, false);
                            cmb.w0(null, cmb.Dj, false);
                            cmb.w0(null, cmb.D8, false);
                            cmb.w0(null, cmb.F8, false);
                            cmb.w0(null, cmb.h6, false);
                            w03 = cmb.w0(null, cmb.Ii, false);
                            w04 = cmb.w0(null, cmb.Ei, false);
                            w05 = cmb.w0(null, cmb.Gi, false);
                        }
                        int i6 = w04;
                        int i7 = w05;
                        k6d k6dVar = new k6d(parentActivity2, ylbVar);
                        Object obj = k6dVar.b;
                        ((my0) obj).w0 = false;
                        int i8 = w03;
                        lp7 lp7Var = new lp7(parentActivity2, ylbVar);
                        lp7Var.setMinValue(0);
                        lp7Var.setMaxValue(10);
                        lp7Var.setTextColor(w0);
                        lp7Var.setValue(g - 1);
                        lp7Var.setWrapSelectorWheel(false);
                        lp7Var.setFormatter(new zg((byte) 1));
                        lp7 lp7Var2 = new lp7(parentActivity2, ylbVar);
                        lp7Var2.setMinValue(0);
                        lp7Var2.setMaxValue(10);
                        lp7Var2.setTextColor(w0);
                        lp7Var2.setValue((g2 / 60) - 1);
                        lp7Var2.setWrapSelectorWheel(false);
                        lp7Var2.setFormatter(new zg((byte) 2));
                        lp7 lp7Var3 = new lp7(parentActivity2, ylbVar);
                        lp7Var3.setMinValue(0);
                        lp7Var3.setMaxValue(0);
                        lp7Var3.setTextColor(w0);
                        lp7Var3.setValue(0);
                        lp7Var3.setWrapSelectorWheel(false);
                        lp7Var3.setFormatter(new zg((byte) 3));
                        zi ziVar = new zi(parentActivity2, lp7Var, lp7Var2, lp7Var3, (byte) 5);
                        ziVar.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(parentActivity2);
                        ziVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity2);
                        textView2.setText(jb6.M0(2131747854, null));
                        textView2.setTextColor(w0);
                        ts2.s(textView2, 1, 20.0f);
                        frameLayout.addView(textView2, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new p8((byte) 6));
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        wb wbVar = new wb(parentActivity2, (byte) 5);
                        linearLayout.addView(lp7Var, qoe.l(0.4f, 0, 270));
                        linearLayout.addView(lp7Var3, qoe.p(0, -2, 0.2f, 16));
                        linearLayout.addView(lp7Var2, qoe.l(0.4f, 0, 270));
                        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                        wbVar.setGravity(17);
                        wbVar.setTextColor(i8);
                        wbVar.setTextSize(1, 14.0f);
                        wbVar.setTypeface(gm.o());
                        int L = gm.L(8.0f);
                        wbVar.setBackgroundDrawable(cmb.i0(L, L, L, L, i6, i7, i7));
                        wbVar.setText(jb6.M0(2131753831, null));
                        ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                        c cVar = new c((byte) 17);
                        lp7Var.setOnValueChangedListener(cVar);
                        lp7Var2.setOnValueChangedListener(cVar);
                        wbVar.setOnClickListener(new ef(lp7Var, lp7Var2, nt8Var, k6dVar, (byte) 1));
                        my0 my0Var = (my0) obj;
                        my0Var.O = ziVar;
                        my0Var.show();
                        my0Var.s0(w02);
                        my0Var.K(w02);
                    }
                }
            } else if (i == this.W) {
                if (getParentActivity() != null) {
                    showDialog(ik.t(getParentActivity(), this.f, this.h, -1, new Runnable(this) {
                        public final st8 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r2;
                            st8 st8Var = this.b;
                            switch (b2) {
                                case 0:
                                    qt8 qt8Var = st8Var.c;
                                    if (qt8Var != null) {
                                        qt8Var.g(st8Var.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qt8 qt8Var2 = st8Var.c;
                                    if (qt8Var2 != null) {
                                        qt8Var2.g(st8Var.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    qt8 qt8Var3 = st8Var.c;
                                    if (qt8Var3 != null) {
                                        qt8Var3.g(st8Var.K);
                                        return;
                                    }
                                    return;
                                default:
                                    qt8 qt8Var4 = st8Var.c;
                                    if (qt8Var4 != null) {
                                        qt8Var4.g(st8Var.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, this.e));
                }
            } else if (i == this.N) {
                oc7.r1(this.currentAccount).W3.edit().putInt("popup_" + str, 1).apply();
                ((w09) view).a(true, true);
                View findViewWithTag = this.b.findViewWithTag(2);
                if (findViewWithTag != null) {
                    ((w09) findViewWithTag).a(false, true);
                }
            } else if (i == this.O) {
                oc7.r1(this.currentAccount).W3.edit().putInt("popup_" + str, 2).apply();
                ((w09) view).a(true, true);
                View findViewWithTag2 = this.b.findViewWithTag(1);
                if (findViewWithTag2 != null) {
                    ((w09) findViewWithTag2).a(false, true);
                }
            } else if (i == this.Q) {
                bjb bjbVar3 = (bjb) view;
                boolean z2 = bjbVar3.e.h;
                boolean z3 = !z2;
                bjbVar3.setChecked(z3);
                SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
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
                        str = jb6.M0(2131751536, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = jb6.M0(2131745014, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
            String p = lo7.p(this.f, this.h, false);
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
            qt8 qt8Var = this.c;
            if (qt8Var != null) {
                if (i == 13) {
                    i3 = this.S;
                } else {
                    i3 = this.H;
                }
                qt8Var.g(i3);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st8.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String p = lo7.p(this.f, this.h, false);
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
            edit.putBoolean("custom_" + p, true).apply();
        }
        nm7.f(this.currentAccount).n(this, nm7.f0);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        gm.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gm.B2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, qoe.e(42, 42, 53));
        }
        gm.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
