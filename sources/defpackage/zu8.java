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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Switch;
public final class zu8 extends e implements fn7 {
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
    public d79 b;
    public boolean b0;
    public xu8 c;
    public boolean c0;
    public AnimatorSet d;
    public final vnb e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public yu8 s;
    public f82 w;
    public int x;
    public int y;

    public zu8(Bundle bundle, vnb vnbVar) {
        super(bundle);
        this.e = vnbVar;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        long j = this.f;
        long j2 = this.h;
        String p = ip7.p(j, j2, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new wu8(this, p));
        vnb vnbVar = this.e;
        f82 f82Var = new f82(context, null, false, vnbVar);
        this.w = f82Var;
        f82Var.setOccupyStatusBar(!hl.O1());
        if (j < 0) {
            if (j2 != 0) {
                TLRPC.TL_forumTopic f = getMessagesController().h4.f(-j, j2);
                ro4.q(this.w.getAvatarImageView(), f, false, true, vnbVar);
                this.simpleActionBar.setTitle(f.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
                this.w.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
        } else {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
            if (X1 != null) {
                this.w.setUserAvatar(X1);
                this.simpleActionBar.setTitle(lv2.m(0, X1.first_name, X1.last_name));
            }
        }
        jla jlaVar = this.simpleActionBar;
        if (this.n) {
            jlaVar.setSubtitle(ob6.M0(2131747622, null));
            this.simpleActionBar.u(ob6.M0(2131745674, null));
        } else {
            jlaVar.setSubtitle(ob6.M0(2131751649, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        d79 d79Var2 = this.b;
        xu8 xu8Var = new xu8(this, context);
        this.c = xu8Var;
        d79Var2.setAdapter(xu8Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new as((byte) 14));
        this.b.setOnItemClickListener(new jr((fn7) this, context, (Object) p, (byte) 3));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final vnb getResourceProvider() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 7);
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.b, 0, new Class[]{uac.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, aob.y6));
        arrayList.add(new apb(this.b, 0, new Class[]{uac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void l0(String str) {
        this.c0 = true;
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        finishFragment();
        yu8 yu8Var = this.s;
        if (yu8Var != null) {
            yu8Var.l();
        }
    }

    public final void m0(int i, int i2, String str) {
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i);
        putInt.putInt("smart_delay_" + str, i2).apply();
        xu8 xu8Var = this.c;
        if (xu8Var != null) {
            xu8Var.g(this.J);
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
            vnb vnbVar = this.e;
            Parcelable parcelable = null;
            if (i == i2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
                String M0 = ob6.M0(2131745829, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745830, null);
                alertDialog$Builder.j(ob6.M0(2131745845, null), new uu8(this, str));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                }
            } else if (i == this.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f);
                bundle.putLong("topic_id", this.h);
                presentFragment(new aq7(bundle, vnbVar));
            } else if (i == this.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).X3;
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
                    cc4.g(e, true);
                }
            } else if (i == this.I) {
                Activity parentActivity = getParentActivity();
                Runnable runnable = new Runnable(this) {
                    public final zu8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        zu8 zu8Var = this.b;
                        switch (b) {
                            case 0:
                                xu8 xu8Var = zu8Var.c;
                                if (xu8Var != null) {
                                    xu8Var.g(zu8Var.I);
                                    return;
                                }
                                return;
                            case 1:
                                xu8 xu8Var2 = zu8Var.c;
                                if (xu8Var2 != null) {
                                    xu8Var2.g(zu8Var.T);
                                    return;
                                }
                                return;
                            case 2:
                                xu8 xu8Var3 = zu8Var.c;
                                if (xu8Var3 != null) {
                                    xu8Var3.g(zu8Var.K);
                                    return;
                                }
                                return;
                            default:
                                xu8 xu8Var4 = zu8Var.c;
                                if (xu8Var4 != null) {
                                    xu8Var4.g(zu8Var.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                Pattern pattern = jj.a;
                long j = this.f;
                if (j != 0) {
                    str3 = qu6.n(j, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                showDialog(jj.V(parentActivity, j, this.h, str3, runnable, this.e));
            } else {
                int i3 = 2;
                if (i == this.F) {
                    wkb wkbVar = (wkb) view;
                    boolean z = !wkbVar.e.h;
                    this.r = z;
                    wkbVar.setChecked(z);
                    int childCount = this.b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        n69 n69Var = (n69) this.b.U(this.b.getChildAt(i4));
                        int i5 = n69Var.f;
                        View view2 = n69Var.a;
                        int b = n69Var.b();
                        if (b != this.F && b != this.Y) {
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                if (i5 == 7 && b == this.G) {
                                                    ((wkb) view2).e(arrayList, this.r);
                                                }
                                            } else {
                                                ((i29) view2).b(arrayList, this.r);
                                            }
                                        } else {
                                            ((ykb) view2).a(arrayList, this.r);
                                        }
                                    } else {
                                        ((ilb) view2).c(arrayList, this.r);
                                    }
                                } else {
                                    ((qmb) view2).a(arrayList, this.r);
                                }
                            } else {
                                ((mf5) view2).a(arrayList, this.r);
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
                        this.d.addListener(new n88(this, (byte) 22));
                        this.d.setDuration(150L);
                        this.d.start();
                    }
                } else if (i == this.G) {
                    wkb wkbVar2 = (wkb) view;
                    Switch r3 = wkbVar2.e;
                    uc7.s1(this.currentAccount).X3.edit().putBoolean(c00.i("content_preview_", str), !r3.h).apply();
                    wkbVar2.setChecked(!r3.h);
                } else if (i == this.T) {
                    showDialog(jj.V(getParentActivity(), this.f, this.h, c00.i("calls_vibrate_", str), new Runnable(this) {
                        public final zu8 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r2;
                            zu8 zu8Var = this.b;
                            switch (b2) {
                                case 0:
                                    xu8 xu8Var = zu8Var.c;
                                    if (xu8Var != null) {
                                        xu8Var.g(zu8Var.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    xu8 xu8Var2 = zu8Var.c;
                                    if (xu8Var2 != null) {
                                        xu8Var2.g(zu8Var.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xu8 xu8Var3 = zu8Var.c;
                                    if (xu8Var3 != null) {
                                        xu8Var3.g(zu8Var.K);
                                        return;
                                    }
                                    return;
                                default:
                                    xu8 xu8Var4 = zu8Var.c;
                                    if (xu8Var4 != null) {
                                        xu8Var4.g(zu8Var.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, this.e));
                } else if (i == this.K) {
                    showDialog(jj.F(getParentActivity(), this.f, this.h, -1, new Runnable(this) {
                        public final zu8 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b2 = r2;
                            zu8 zu8Var = this.b;
                            switch (b2) {
                                case 0:
                                    xu8 xu8Var = zu8Var.c;
                                    if (xu8Var != null) {
                                        xu8Var.g(zu8Var.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    xu8 xu8Var2 = zu8Var.c;
                                    if (xu8Var2 != null) {
                                        xu8Var2.g(zu8Var.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    xu8 xu8Var3 = zu8Var.c;
                                    if (xu8Var3 != null) {
                                        xu8Var3.g(zu8Var.K);
                                        return;
                                    }
                                    return;
                                default:
                                    xu8 xu8Var4 = zu8Var.c;
                                    if (xu8Var4 != null) {
                                        xu8Var4.g(zu8Var.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, this.e));
                } else if (i == this.J) {
                    if (getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = uc7.s1(this.currentAccount).X3;
                        int g = qu6.g("smart_max_count_", str, sharedPreferences2, 2);
                        int g2 = qu6.g("smart_delay_", str, sharedPreferences2, 180);
                        if (g != 0) {
                            i3 = g;
                        }
                        Activity parentActivity2 = getParentActivity();
                        uu8 uu8Var = new uu8(this, str);
                        Pattern pattern2 = jj.a;
                        if (parentActivity2 != null) {
                            int i6 = aob.j5;
                            if (vnbVar != null) {
                                w0 = vnbVar.f(i6);
                                w02 = vnbVar.f(aob.h5);
                                vnbVar.f(aob.Aj);
                                vnbVar.f(aob.Ej);
                                vnbVar.f(aob.E8);
                                vnbVar.f(aob.G8);
                                vnbVar.f(aob.i6);
                                w03 = vnbVar.f(aob.Ji);
                                w04 = vnbVar.f(aob.Fi);
                                w05 = vnbVar.f(aob.Hi);
                            } else {
                                w0 = aob.w0(null, i6, false);
                                w02 = aob.w0(null, aob.h5, false);
                                aob.w0(null, aob.Aj, false);
                                aob.w0(null, aob.Ej, false);
                                aob.w0(null, aob.E8, false);
                                aob.w0(null, aob.G8, false);
                                aob.w0(null, aob.i6, false);
                                w03 = aob.w0(null, aob.Ji, false);
                                w04 = aob.w0(null, aob.Fi, false);
                                w05 = aob.w0(null, aob.Hi, false);
                            }
                            int i7 = w04;
                            int i8 = w05;
                            z8d z8dVar = new z8d(parentActivity2, vnbVar);
                            ((nx0) z8dVar.b).w0 = false;
                            hq7 hq7Var = new hq7(parentActivity2, vnbVar);
                            hq7Var.setMinValue(0);
                            hq7Var.setMaxValue(10);
                            hq7Var.setTextColor(w0);
                            hq7Var.setValue(i3 - 1);
                            hq7Var.setWrapSelectorWheel(false);
                            hq7Var.setFormatter(new e((byte) 28));
                            hq7 hq7Var2 = new hq7(parentActivity2, vnbVar);
                            hq7Var2.setMinValue(0);
                            hq7Var2.setMaxValue(10);
                            hq7Var2.setTextColor(w0);
                            hq7Var2.setValue((g2 / 60) - 1);
                            hq7Var2.setWrapSelectorWheel(false);
                            hq7Var2.setFormatter(new e((byte) 29));
                            hq7 hq7Var3 = new hq7(parentActivity2, vnbVar);
                            hq7Var3.setMinValue(0);
                            hq7Var3.setMaxValue(0);
                            hq7Var3.setTextColor(w0);
                            hq7Var3.setValue(0);
                            hq7Var3.setWrapSelectorWheel(false);
                            hq7Var3.setFormatter(new bg((byte) 0));
                            ai aiVar = new ai(parentActivity2, hq7Var, hq7Var2, hq7Var3, (byte) 5);
                            aiVar.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            aiVar.addView(frameLayout, tre.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(ob6.M0(2131747848, null));
                            textView2.setTextColor(w0);
                            bs2.t(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new q8((byte) 5));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            aiVar.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            xb xbVar = new xb(parentActivity2, (byte) 5);
                            linearLayout.addView(hq7Var, tre.l(0.4f, 0, 270));
                            linearLayout.addView(hq7Var3, tre.p(0, -2, 0.2f, 16));
                            linearLayout.addView(hq7Var2, tre.l(0.4f, 0, 270));
                            xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                            xbVar.setGravity(17);
                            xbVar.setTextColor(w03);
                            xbVar.setTextSize(1, 14.0f);
                            xbVar.setTypeface(hl.o());
                            int L = hl.L(8.0f);
                            xbVar.setBackgroundDrawable(aob.i0(L, L, L, L, i7, i8, i8));
                            xbVar.setText(ob6.M0(2131753859, null));
                            aiVar.addView(xbVar, tre.t(-1, 48, 83, 16, 15, 16, 16));
                            bg bgVar = new bg((byte) 18);
                            hq7Var.setOnValueChangedListener(bgVar);
                            hq7Var2.setOnValueChangedListener(bgVar);
                            xbVar.setOnClickListener(new cg(hq7Var, hq7Var2, uu8Var, z8dVar, (byte) 0));
                            nx0 nx0Var = (nx0) z8dVar.b;
                            nx0Var.O = aiVar;
                            nx0Var.show();
                            nx0Var.s0(w02);
                            nx0Var.K(w02);
                        }
                    }
                } else if (i == this.W) {
                    if (getParentActivity() != null) {
                        showDialog(jj.t(getParentActivity(), this.f, this.h, -1, new Runnable(this) {
                            public final zu8 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zu8 zu8Var = this.b;
                                switch (b2) {
                                    case 0:
                                        xu8 xu8Var = zu8Var.c;
                                        if (xu8Var != null) {
                                            xu8Var.g(zu8Var.I);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        xu8 xu8Var2 = zu8Var.c;
                                        if (xu8Var2 != null) {
                                            xu8Var2.g(zu8Var.T);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        xu8 xu8Var3 = zu8Var.c;
                                        if (xu8Var3 != null) {
                                            xu8Var3.g(zu8Var.K);
                                            return;
                                        }
                                        return;
                                    default:
                                        xu8 xu8Var4 = zu8Var.c;
                                        if (xu8Var4 != null) {
                                            xu8Var4.g(zu8Var.W);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, this.e));
                    }
                } else if (i == this.N) {
                    uc7.s1(this.currentAccount).X3.edit().putInt("popup_" + str, 1).apply();
                    ((i29) view).a(true, true);
                    View findViewWithTag = this.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((i29) findViewWithTag).a(false, true);
                    }
                } else if (i == this.O) {
                    uc7.s1(this.currentAccount).X3.edit().putInt("popup_" + str, 2).apply();
                    ((i29) view).a(true, true);
                    View findViewWithTag2 = this.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((i29) findViewWithTag2).a(false, true);
                    }
                } else if (i == this.Q) {
                    wkb wkbVar3 = (wkb) view;
                    boolean z2 = wkbVar3.e.h;
                    boolean z3 = !z2;
                    wkbVar3.setChecked(z3);
                    SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
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
                        str = ob6.M0(2131751564, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = ob6.M0(2131745008, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
            String p = ip7.p(this.f, this.h, false);
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
            xu8 xu8Var = this.c;
            if (xu8Var != null) {
                if (i == 13) {
                    i3 = this.S;
                } else {
                    i3 = this.H;
                }
                xu8Var.g(i3);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu8.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String p = ip7.p(this.f, this.h, false);
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
            edit.putBoolean("custom_" + p, true).apply();
        }
        jn7.f(this.currentAccount).n(this, jn7.f0);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        hl.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - hl.L(42.0f)) / 2) + this.mSystemInsets.b, hl.L(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        hl.B2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, tre.e(42, 42, 53));
        }
        hl.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - hl.L(42.0f)) / 2) + this.mSystemInsets.b, hl.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
