package ig;

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
import bi.c7;
import bi.r3;
import bi.r4;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import w7.x5;
public final class y1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public d61 f12289a;
    public final ArrayList f12290b;
    public NumberTextView f12291c;
    public org.telegram.ui.ActionBar.v0 d;
    public int f12292e;
    public boolean f12293f;

    public y1() {
        super(null);
        this.f12290b = new ArrayList();
        this.f12293f = true;
    }

    public static void U(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.f12292e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((h51) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((h51) arrayList.get(i11)).G).f11994c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.f12007b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i12)).f11992a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(20));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).f11992a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i14)).f11992a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f12006a).sendRequest(tL_messages_reorderQuickReplies, new c7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(y1 y1Var, ArrayList arrayList, v51 v51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        h51 h51Var = new h51(2);
        h51Var.f26594l = string;
        h51Var.f26597o = string2;
        h51Var.f26595m = "RestrictedEmoji";
        h51Var.f26596n = "📝";
        arrayList.add(h51Var);
        v51Var.U();
        b2 f7 = b2.f(y1Var.currentAccount);
        ArrayList arrayList2 = f7.f12007b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11993b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11993b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f12006a).quickRepliesLimit) {
            h51 c10 = h51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f26599q = true;
            arrayList.add(c10);
        }
        y1Var.f12292e = v51Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).f12007b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            h51 h51Var2 = new h51(16);
            h51Var2.G = a2Var;
            h51Var2.K(y1Var.f12290b.contains(Integer.valueOf(a2Var.f11992a)));
            arrayList.add(h51Var2);
        }
        v51Var.L();
        v51Var.T();
        i2.g.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, h51 h51Var, View view) {
        if (h51Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new bi.o1(y1Var, 23));
        } else if (h51Var.f44071a == 16 && (h51Var.G instanceof a2)) {
            if (!y1Var.f12290b.isEmpty()) {
                y1Var.e0(h51Var, view);
                return;
            }
            a2 a2Var = (a2) h51Var.G;
            if (!a2Var.f11997g) {
                Bundle e7 = p6.e(5, "chatMode");
                e7.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                e7.putString("quick_reply", a2Var.f11993b);
                co coVar = new co(e7);
                coVar.nb(a2Var.f11992a);
                y1Var.presentFragment(coVar);
            }
        }
    }

    public static void X(y1 y1Var) {
        y1Var.f12290b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.f12289a, (e2.h) new bi.f(4));
        y1Var.actionBar.r();
        y1Var.f12289a.v1(false);
    }

    public static int c0(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, a2 a2Var, f6 f6Var, Utilities.Callback callback) {
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
        if (R != null && (R.getFragmentView() instanceof ov0) && ((ov0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (a2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20198a;
        b2Var.R = string;
        final r1 r1Var = new r1(activity, f6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        if (a2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = a2Var.f11993b;
        }
        r1Var.setText(charSequence);
        int i13 = j6.f20770j5;
        r1Var.setTextColor(j6.v0(i13, f6Var));
        r1Var.setHintColor(j6.v0(j6.Xh, f6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(j6.v0(j6.f20791k6, f6Var), j6.v0(j6.f20809l6, f6Var), j6.v0(j6.f20880p7, f6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f7 = org.telegram.messenger.w1.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        vl.n(i13, f6Var, textView, 1, 16.0f);
        if (a2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, x5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        vl.n(j6.f20898q7, f6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, x5.e(-1, -2, 83));
        r3 r3Var = new r3(r15, new ValueAnimator[1], textView2, textView, 2);
        Runnable[] runnableArr = {new t0(r3Var, 3)};
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        f7.addView(frameLayout, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(r1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        b2Var.f20224a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, r3Var, callback, b2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new n1(r1Var, r3Var, i10, a2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new i0.b(8));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new q(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            return;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            b2Var.O = new bi.o1(r1Var, 24);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new r4(r1Var, 3));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            return;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].f20238h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f12291c = numberTextView;
        numberTextView.setTextSize(18);
        this.f12291c.setTypeface(AndroidUtilities.bold());
        this.f12291c.setTextColor(j6.w0(null, j6.f21044y8, false));
        j3.addView(this.f12291c, x5.m(1.0f, 0, -1, 72, 0, 0));
        this.f12291c.setOnTouchListener(new ci.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        q1 q1Var = new q1(context, null, 0);
        q1Var.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
        d61 d61Var = new d61(this, new Utilities.Callback2(this) {
            public final y1 f12141b;

            {
                this.f12141b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f12141b, (ArrayList) obj, (v51) obj2);
                        return;
                    default:
                        y1.U(this.f12141b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f12289a = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.f12289a;
        d61Var2.Y2.f31135r = false;
        d61Var2.A1(new Utilities.Callback2(this) {
            public final y1 f12141b;

            {
                this.f12141b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f12141b, (ArrayList) obj, (v51) obj2);
                        return;
                    default:
                        y1.U(this.f12141b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        q1Var.addView(this.f12289a, x5.c(-1.0f, -1));
        this.actionBar.A(this.f12289a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d61 d61Var;
        v51 v51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (d61Var = this.f12289a) != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
        }
    }

    public final void e0(h51 h51Var, View view) {
        boolean z10;
        float f7;
        float f10;
        a2 a2Var = (a2) h51Var.G;
        x1 x1Var = (x1) view;
        Integer valueOf = Integer.valueOf(a2Var.f11992a);
        ArrayList arrayList = this.f12290b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(a2Var.f11992a));
        } else {
            arrayList.add(Integer.valueOf(a2Var.f11992a));
        }
        boolean z11 = true;
        this.f12289a.v1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(a2Var.f11992a));
        h51Var.f26588e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f12291c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || b2.g(c10.f11993b)) ? false : false;
        }
        if (this.f12293f != z10) {
            this.f12293f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f12293f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f12293f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f12293f) {
                f11 = 0.7f;
            }
            vl.q(scaleX.scaleY(f11), pr.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        b2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f12289a.setPadding(0, 0, 0, i13);
        this.f12289a.setClipToPadding(false);
    }
}
