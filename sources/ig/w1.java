package ig;

import ai.cb;
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
import ci.d6;
import ci.y2;
import com.google.android.gms.internal.play_billing.k3;
import ei.bc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import w7.z5;
public final class w1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 h;
    public i71 f13112a;
    public final ArrayList f13113b;
    public NumberTextView f13114c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f13115f;

    public w1() {
        super(null);
        this.f13113b = new ArrayList();
        this.f13115f = true;
    }

    public static void U(w1 w1Var, int i10, ArrayList arrayList) {
        if (i10 == w1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((l61) arrayList.get(i11)).G instanceof y1) {
                    ((y1) ((l61) arrayList.get(i11)).G).f13131c = i11;
                }
            }
            z1 f7 = z1.f(w1Var.currentAccount);
            ArrayList arrayList2 = f7.f13139b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = k3.f(((y1) arrayList2.get(i12)).f13129a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((y1) arrayList2.get(i13)).f13129a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = k3.f(((y1) arrayList2.get(i14)).f13129a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f13138a).sendRequest(tL_messages_reorderQuickReplies, new d6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(w1 w1Var, ArrayList arrayList, a71 a71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        l61 l61Var = new l61(2);
        l61Var.f28227l = string;
        l61Var.f28230o = string2;
        l61Var.f28228m = "RestrictedEmoji";
        l61Var.f28229n = "📝";
        arrayList.add(l61Var);
        a71Var.U();
        z1 f7 = z1.f(w1Var.currentAccount);
        ArrayList arrayList2 = f7.f13139b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((y1) arrayList2.get(i13)).f13130b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((y1) arrayList2.get(i13)).f13130b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f13138a).quickRepliesLimit) {
            l61 c10 = l61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f28232q = true;
            arrayList.add(c10);
        }
        w1Var.e = a71Var.M();
        ArrayList arrayList3 = z1.f(w1Var.currentAccount).f13139b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            y1 y1Var = (y1) obj;
            l61 l61Var2 = new l61(16);
            l61Var2.G = y1Var;
            l61Var2.K(w1Var.f13113b.contains(Integer.valueOf(y1Var.f13129a)));
            arrayList.add(l61Var2);
        }
        a71Var.L();
        a71Var.T();
        i2.o1.B(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(w1 w1Var, l61 l61Var, View view) {
        if (l61Var.d == 1) {
            d0(w1Var.getParentActivity(), w1Var.currentAccount, null, null, w1Var.getResourceProvider(), new k0(w1Var, 2));
        } else if (l61Var.f44712a == 16 && (l61Var.G instanceof y1)) {
            if (!w1Var.f13113b.isEmpty()) {
                w1Var.e0(l61Var, view);
                return;
            }
            y1 y1Var = (y1) l61Var.G;
            if (!y1Var.f13133g) {
                Bundle i10 = org.telegram.ui.Cells.b1.i(5, "chatMode");
                i10.putLong("user_id", w1Var.getUserConfig().getClientUserId());
                i10.putString("quick_reply", y1Var.f13130b);
                sn snVar = new sn(i10);
                snVar.tb(y1Var.f13129a);
                w1Var.presentFragment(snVar);
            }
        }
    }

    public static void X(w1 w1Var) {
        w1Var.f13113b.clear();
        AndroidUtilities.forEachViews((RecyclerView) w1Var.f13112a, (Utilities.Callback<View>) new ci.e(4));
        w1Var.actionBar.r();
        w1Var.f13112a.C1(false);
    }

    public static int c0(w1 w1Var) {
        return w1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, y1 y1Var, g6 g6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof nw0) && ((nw0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (y1Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f20679a;
        c2Var.R = string;
        final p1 p1Var = new p1(activity, g6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        p1Var.setTextSize(1, 18.0f);
        if (y1Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = y1Var.f13130b;
        }
        p1Var.setText(charSequence);
        int i13 = k6.f21290j5;
        r6.W(p1Var, i13, g6Var);
        r6.m(p1Var, 34, k6.Xh, g6Var);
        p1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        p1Var.setSingleLine(true);
        p1Var.setFocusable(true);
        r6.H(p1Var, k6.f21311k6, k6.f21328l6, k6.f21405p7, g6Var);
        p1Var.setImeOptions(6);
        p1Var.setBackgroundDrawable(null);
        p1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        p1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        r6.W(textView, i13, g6Var);
        textView.setTextSize(1, 16.0f);
        if (y1Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        r6.W(textView2, k6.f21422q7, g6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        y2 y2Var = new y2(r4, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new bc(y2Var, 23)};
        p1Var.addTextChangedListener(new r1(textView2, runnableArr));
        f7.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(p1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f7);
        c2Var.f20743a = AndroidUtilities.dp(292.0f);
        p1Var.setOnEditorActionListener(new s1(p1Var, i10, y1Var, textView2, y2Var, callback, c2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new l1(p1Var, y2Var, i10, y1Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fh.b(29));
        if (z10) {
            h = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new q(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            p1 p1Var2 = p1Var;
                            p1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var2);
                            return;
                        default:
                            p1 p1Var3 = p1Var;
                            p1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var3);
                            return;
                    }
                }
            });
            h.r(250L);
        } else {
            r32 = 0;
            c2Var.O = new k0(p1Var, 3);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new cb(p1Var, 6));
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            p1 p1Var2 = p1Var;
                            p1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var2);
                            return;
                        default:
                            p1 p1Var3 = p1Var;
                            p1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(p1Var3);
                            return;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[r32].f20765j0 = r32;
        p1Var.setSelection(p1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new n1(this));
        org.telegram.ui.ActionBar.y i10 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f13114c = numberTextView;
        numberTextView.setTextSize(18);
        this.f13114c.setTypeface(AndroidUtilities.bold());
        this.f13114c.setTextColor(k6.x0(null, k6.f21574y8, false));
        i10.addView(this.f13114c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f13114c.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.u0 a2 = i10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        i10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        o1 o1Var = new o1(context, null, 0);
        r6.i(k6.f21126a7, o1Var, null);
        i71 i71Var = new i71(this, new Utilities.Callback2(this) {
            public final w1 f12979b;

            {
                this.f12979b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        w1.V(this.f12979b, (ArrayList) obj, (a71) obj2);
                        return;
                    default:
                        w1.U(this.f12979b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new k1(this), new k1(this));
        this.f13112a = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.f13112a;
        i71Var2.Z2.f24646r = false;
        i71Var2.H1(new Utilities.Callback2(this) {
            public final w1 f12979b;

            {
                this.f12979b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        w1.V(this.f12979b, (ArrayList) obj, (a71) obj2);
                        return;
                    default:
                        w1.U(this.f12979b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        o1Var.addView(this.f13112a, z5.c(-1.0f, -1));
        this.actionBar.z(this.f13112a, true);
        this.fragmentView = o1Var;
        return o1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i71 i71Var;
        a71 a71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (i71Var = this.f13112a) != null && (a71Var = i71Var.Z2) != null) {
            a71Var.N(true);
        }
    }

    public final void e0(l61 l61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        y1 y1Var = (y1) l61Var.G;
        v1 v1Var = (v1) view;
        Integer valueOf = Integer.valueOf(y1Var.f13129a);
        ArrayList arrayList = this.f13113b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(y1Var.f13129a));
        } else {
            arrayList.add(Integer.valueOf(y1Var.f13129a));
        }
        boolean z11 = true;
        this.f13112a.C1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(y1Var.f13129a));
        l61Var.e = contains;
        v1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.N(null, null);
            }
        }
        this.f13114c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            y1 c10 = z1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 == null || z1.g(c10.f13130b)) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f13115f != z10) {
            this.f13115f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f13115f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f13115f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f13115f) {
                f11 = 0.7f;
            }
            tl.t(scaleX.scaleY(f11), zr.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        z1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f13112a.setPadding(0, 0, 0, i13);
        this.f13112a.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            NumberTextView numberTextView = this.f13114c;
            if (numberTextView != null) {
                numberTextView.setTextColor(k6.x0(null, k6.f21574y8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
