package hg;

import ai.e4;
import ai.g5;
import ai.t7;
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
import ci.uc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import w7.x5;
public final class z1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public e61 f10490a;
    public final ArrayList f10491b;
    public NumberTextView f10492c;
    public org.telegram.ui.ActionBar.v0 d;
    public int e;
    public boolean f10493f;

    public z1() {
        super(null);
        this.f10491b = new ArrayList();
        this.f10493f = true;
    }

    public static void U(z1 z1Var, int i10, ArrayList arrayList) {
        if (i10 == z1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((i51) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((i51) arrayList.get(i11)).G).f10221c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.f10239b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i12)).f10219a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).f10219a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i14)).f10219a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f10238a).sendRequest(tL_messages_reorderQuickReplies, new t7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(z1 z1Var, ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        i51 i51Var = new i51(2);
        i51Var.f24900l = string;
        i51Var.f24903o = string2;
        i51Var.f24901m = "RestrictedEmoji";
        i51Var.f24902n = "📝";
        arrayList.add(i51Var);
        w51Var.U();
        c2 f7 = c2.f(z1Var.currentAccount);
        ArrayList arrayList2 = f7.f10239b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((b2) arrayList2.get(i13)).f10220b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((b2) arrayList2.get(i13)).f10220b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f10238a).quickRepliesLimit) {
            i51 c10 = i51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f24905q = true;
            arrayList.add(c10);
        }
        z1Var.e = w51Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).f10239b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            i51 i51Var2 = new i51(16);
            i51Var2.G = b2Var;
            i51Var2.K(z1Var.f10491b.contains(Integer.valueOf(b2Var.f10219a)));
            arrayList.add(i51Var2);
        }
        w51Var.L();
        w51Var.T();
        c.p(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(z1 z1Var, i51 i51Var, View view) {
        if (i51Var.d == 1) {
            d0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ai.y1(z1Var, 23));
        } else if (i51Var.f15531a == 16 && (i51Var.G instanceof b2)) {
            if (!z1Var.f10491b.isEmpty()) {
                z1Var.e0(i51Var, view);
                return;
            }
            b2 b2Var = (b2) i51Var.G;
            if (!b2Var.f10223g) {
                Bundle e = q3.e(5, "chatMode");
                e.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                e.putString("quick_reply", b2Var.f10220b);
                bo boVar = new bo(e);
                boVar.nb(b2Var.f10219a);
                z1Var.presentFragment(boVar);
            }
        }
    }

    public static void X(z1 z1Var) {
        z1Var.f10491b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.f10490a, (e2.h) new ai.i(4));
        z1Var.actionBar.r();
        z1Var.f10490a.w1(false);
    }

    public static int c0(z1 z1Var) {
        return z1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, b2 b2Var, e6 e6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (b2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18435a;
        b2Var2.R = string;
        final s1 s1Var = new s1(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        if (b2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = b2Var.f10220b;
        }
        s1Var.setText(charSequence);
        int i13 = i6.f18940j5;
        s1Var.setTextColor(i6.v0(i13, e6Var));
        s1Var.setHintColor(i6.v0(i6.Xh, e6Var));
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        s1Var.setLineColors(i6.v0(i6.f18961k6, e6Var), i6.v0(i6.f18979l6, e6Var), i6.v0(i6.f19053p7, e6Var));
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f7 = org.telegram.messenger.y0.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        vl.o(i13, e6Var, textView, 1, 16.0f);
        if (b2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, x5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        vl.o(i6.f19071q7, e6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, x5.e(-1, -2, 83));
        e4 e4Var = new e4(r15, new ValueAnimator[1], textView2, textView, 2);
        Runnable[] runnableArr = {new uc(e4Var, 24)};
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        f7.addView(frameLayout, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(s1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        b2Var2.f18459a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, e4Var, callback, b2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new o1(s1Var, e4Var, i10, b2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r(1));
        if (z10) {
            h = b2Var2;
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new s(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            s1 s1Var2 = s1Var;
                            s1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var2);
                            return;
                        default:
                            s1 s1Var3 = s1Var;
                            s1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            b2Var2.O = new ai.y1(s1Var, 24);
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new g5(s1Var, 3));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            s1 s1Var2 = s1Var;
                            s1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var2);
                            return;
                        default:
                            s1 s1Var3 = s1Var;
                            s1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].f18472h0 = r32;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new q1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f10492c = numberTextView;
        numberTextView.setTextSize(18);
        this.f10492c.setTypeface(AndroidUtilities.bold());
        this.f10492c.setTextColor(i6.w0(null, i6.f19217y8, false));
        j3.addView(this.f10492c, x5.m(1.0f, 0, -1, 72, 0, 0));
        this.f10492c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        r1 r1Var = new r1(context, null, 0);
        r1Var.setBackgroundColor(i6.w0(null, i6.f18778a7, false));
        e61 e61Var = new e61(this, new Utilities.Callback2(this) {
            public final z1 f10358b;

            {
                this.f10358b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f10358b, (ArrayList) obj, (w51) obj2);
                        return;
                    default:
                        z1.U(this.f10358b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new n1(this), new n1(this));
        this.f10490a = e61Var;
        e61Var.p1();
        e61 e61Var2 = this.f10490a;
        e61Var2.Y2.f29610r = false;
        e61Var2.B1(new Utilities.Callback2(this) {
            public final z1 f10358b;

            {
                this.f10358b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f10358b, (ArrayList) obj, (w51) obj2);
                        return;
                    default:
                        z1.U(this.f10358b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        r1Var.addView(this.f10490a, x5.c(-1.0f, -1));
        this.actionBar.z(this.f10490a, true);
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e61 e61Var;
        w51 w51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (e61Var = this.f10490a) != null && (w51Var = e61Var.Y2) != null) {
            w51Var.N(true);
        }
    }

    public final void e0(i51 i51Var, View view) {
        boolean z10;
        float f7;
        float f10;
        b2 b2Var = (b2) i51Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.f10219a);
        ArrayList arrayList = this.f10491b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.f10219a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.f10219a));
        }
        boolean z11 = true;
        this.f10490a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.f10219a));
        i51Var.e = contains;
        y1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f10492c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b2 c10 = c2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || c2.g(c10.f10220b)) ? false : false;
        }
        if (this.f10493f != z10) {
            this.f10493f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f10493f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f10493f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f10493f) {
                f11 = 0.7f;
            }
            vl.r(scaleX.scaleY(f11), qr.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        c2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f10490a.setPadding(0, 0, 0, i13);
        this.f10490a.setClipToPadding(false);
    }
}
