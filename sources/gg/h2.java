package gg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import w7.a6;
public final class h2 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.d2 h;
    public r61 f8904a;
    public final ArrayList f8905b;
    public NumberTextView f8906c;
    public org.telegram.ui.ActionBar.w0 d;
    public int e;
    public boolean f8907f;

    public h2() {
        super(null);
        this.f8905b = new ArrayList();
        this.f8907f = true;
    }

    public static void U(h2 h2Var, int i10, ArrayList arrayList) {
        if (i10 == h2Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((v51) arrayList.get(i11)).G instanceof j2) {
                    ((j2) ((v51) arrayList.get(i11)).G).f8919c = i11;
                }
            }
            k2 f7 = k2.f(h2Var.currentAccount);
            ArrayList arrayList2 = f7.f8938b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.d(((j2) arrayList2.get(i12)).f8917a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(9));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((j2) arrayList2.get(i13)).f8917a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.d(((j2) arrayList2.get(i14)).f8917a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f8937a).sendRequest(tL_messages_reorderQuickReplies, new bi.g1(1));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(h2 h2Var, ArrayList arrayList, j61 j61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        v51 v51Var = new v51(2);
        v51Var.f27829l = string;
        v51Var.f27832o = string2;
        v51Var.f27830m = "RestrictedEmoji";
        v51Var.f27831n = "📝";
        arrayList.add(v51Var);
        j61Var.U();
        k2 f7 = k2.f(h2Var.currentAccount);
        ArrayList arrayList2 = f7.f8938b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((j2) arrayList2.get(i13)).f8918b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((j2) arrayList2.get(i13)).f8918b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f8937a).quickRepliesLimit) {
            v51 c10 = v51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f27834q = true;
            arrayList.add(c10);
        }
        h2Var.e = j61Var.M();
        ArrayList arrayList3 = k2.f(h2Var.currentAccount).f8938b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            j2 j2Var = (j2) obj;
            v51 v51Var2 = new v51(16);
            v51Var2.G = j2Var;
            v51Var2.K(h2Var.f8905b.contains(Integer.valueOf(j2Var.f8917a)));
            arrayList.add(v51Var2);
        }
        j61Var.L();
        j61Var.T();
        com.google.android.gms.internal.vision.e2.w(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(h2 h2Var, v51 v51Var, View view) {
        if (v51Var.d == 1) {
            d0(h2Var.getParentActivity(), h2Var.currentAccount, null, null, h2Var.getResourceProvider(), new ai.b(h2Var, 19));
        } else if (v51Var.f14046a == 16 && (v51Var.G instanceof j2)) {
            if (!h2Var.f8905b.isEmpty()) {
                h2Var.e0(v51Var, view);
                return;
            }
            j2 j2Var = (j2) v51Var.G;
            if (!j2Var.f8921g) {
                Bundle e = r6.e(5, "chatMode");
                e.putLong("user_id", h2Var.getUserConfig().getClientUserId());
                e.putString("quick_reply", j2Var.f8918b);
                eo eoVar = new eo(e);
                eoVar.nb(j2Var.f8917a);
                h2Var.presentFragment(eoVar);
            }
        }
    }

    public static void X(h2 h2Var) {
        h2Var.f8905b.clear();
        AndroidUtilities.forEachViews((RecyclerView) h2Var.f8904a, (e2.h) new g0(1));
        h2Var.actionBar.r();
        h2Var.f8904a.v1(false);
    }

    public static void d0(Activity activity, int i10, String str, j2 j2Var, f6 f6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r02;
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof aw0) && ((aw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (j2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f17528a;
        d2Var.R = string;
        final a2 a2Var = new a2(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        if (j2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = j2Var.f8918b;
        }
        a2Var.setText(charSequence);
        int i13 = j6.f18034j5;
        a2Var.setTextColor(j6.v0(i13, f6Var));
        a2Var.setHintColor(j6.v0(j6.Xh, f6Var));
        a2Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        a2Var.setSingleLine(true);
        a2Var.setFocusable(true);
        a2Var.setLineColors(j6.v0(j6.f18055k6, f6Var), j6.v0(j6.f18073l6, f6Var), j6.v0(j6.f18144p7, f6Var));
        a2Var.setImeOptions(6);
        a2Var.setBackgroundDrawable(null);
        a2Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        a2Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        em.n(i13, f6Var, textView, 1, 16.0f);
        if (j2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, a6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        em.n(j6.f18162q7, f6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, a6.e(-1, -2, 83));
        u1 u1Var = new u1(r15, new ValueAnimator[1], textView2, textView, 0);
        Runnable[] runnableArr = {new v1(u1Var, 0)};
        a2Var.addTextChangedListener(new c2(textView2, runnableArr));
        f7.addView(frameLayout, a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(a2Var, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        d2Var.f17609a = AndroidUtilities.dp(292.0f);
        a2Var.setOnEditorActionListener(new d2(a2Var, i10, j2Var, textView2, u1Var, callback, d2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new w1(a2Var, u1Var, i10, j2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new dh.a(24));
        if (z10) {
            h = d2Var;
            r02 = 0;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new s(1, view));
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            a2 a2Var2 = a2Var;
                            a2Var2.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var2);
                            return;
                        default:
                            a2 a2Var3 = a2Var;
                            a2Var3.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r02 = 0;
            d2Var.O = new ai.b(a2Var, 20);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new o(a2Var, 1));
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            a2 a2Var2 = a2Var;
                            a2Var2.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var2);
                            return;
                        default:
                            a2 a2Var3 = a2Var;
                            a2Var3.requestFocus();
                            AndroidUtilities.showKeyboard(a2Var3);
                            return;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[r02].f17622h0 = r02;
        a2Var.setSelection(a2Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new y1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f8906c = numberTextView;
        numberTextView.setTextSize(18);
        this.f8906c.setTypeface(AndroidUtilities.bold());
        this.f8906c.setTextColor(j6.w0(null, j6.f18308y8, false));
        j3.addView(this.f8906c, a6.m(1.0f, 0, -1, 72, 0, 0));
        this.f8906c.setOnTouchListener(new ai.h(2));
        org.telegram.ui.ActionBar.w0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        z1 z1Var = new z1(context, null, 0);
        z1Var.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        r61 r61Var = new r61(this, new Utilities.Callback2(this) {
            public final h2 f9028b;

            {
                this.f9028b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        h2.V(this.f9028b, (ArrayList) obj, (j61) obj2);
                        return;
                    default:
                        h2.U(this.f9028b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new s1(this), new s1(this));
        this.f8904a = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.f8904a;
        r61Var2.Y2.f24250r = false;
        r61Var2.A1(new Utilities.Callback2(this) {
            public final h2 f9028b;

            {
                this.f9028b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        h2.V(this.f9028b, (ArrayList) obj, (j61) obj2);
                        return;
                    default:
                        h2.U(this.f9028b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        z1Var.addView(this.f8904a, a6.c(-1.0f, -1));
        this.actionBar.z(this.f8904a, true);
        this.fragmentView = z1Var;
        return z1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r61 r61Var;
        j61 j61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (r61Var = this.f8904a) != null && (j61Var = r61Var.Y2) != null) {
            j61Var.N(true);
        }
    }

    public final void e0(v51 v51Var, View view) {
        boolean z10;
        float f7;
        float f10;
        j2 j2Var = (j2) v51Var.G;
        g2 g2Var = (g2) view;
        Integer valueOf = Integer.valueOf(j2Var.f8917a);
        ArrayList arrayList = this.f8905b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(j2Var.f8917a));
        } else {
            arrayList.add(Integer.valueOf(j2Var.f8917a));
        }
        boolean z11 = true;
        this.f8904a.v1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(j2Var.f8917a));
        v51Var.e = contains;
        g2Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f8906c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j2 c10 = k2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || k2.g(c10.f8918b)) ? false : false;
        }
        if (this.f8907f != z10) {
            this.f8907f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f8907f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f8907f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f8907f) {
                f11 = 0.7f;
            }
            em.q(scaleX.scaleY(f11), wr.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        k2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f8904a.setPadding(0, 0, 0, i13);
        this.f8904a.setClipToPadding(false);
    }
}
