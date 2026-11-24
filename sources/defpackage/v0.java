package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.HttpGetFileTask;
public final class v0 implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;

    public v0(int i, k27 k27Var) {
        this.a = (byte) 15;
        this.b = i;
        this.c = k27Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int i;
        m21 j;
        byte b = this.a;
        int i2 = 1;
        int i3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((p8c) obj).a(Integer.valueOf(i3));
                return;
            case 1:
                ((m) obj).a(Integer.valueOf(i3));
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj;
                boolean z3 = !zArr[i3];
                zArr[i3] = z3;
                ((ag2) view).c(z3, true);
                return;
            case 3:
                ((mu1) obj).a8(i3);
                return;
            case 4:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout.b.U2.getActionBarMenuOnItemClick().b(i3);
                chatAttachAlertPhotoLayout.x.U(null, null);
                return;
            case 5:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i3);
                return;
            case 6:
                l24 l24Var = (l24) obj;
                if (l24Var.n != null && i3 != l24Var.s) {
                    c4c c4cVar = l24Var.r;
                    if (c4cVar != null) {
                        c4cVar.A = i3;
                    }
                    l24Var.b(i3, true);
                    l24Var.n.a(Integer.valueOf(i3));
                    return;
                }
                return;
            case 7:
                ((f65) obj).l1.x(i3, true);
                return;
            case 8:
                f65 f65Var = (f65) ((f95) obj).d;
                f65Var.E0(i3);
                f65Var.dismiss();
                return;
            case 9:
                ah6 ah6Var = (ah6) obj;
                ValueAnimator valueAnimator = ah6Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    iec iecVar = ah6Var.c;
                    if (!iecVar.I) {
                        if (iecVar.getCurrentPosition() == i3) {
                            d b0 = ah6Var.b0();
                            if (b0 instanceof zg6) {
                                ((zg6) b0).v();
                                return;
                            }
                            return;
                        }
                        ah6Var.r0(i3, true);
                        ah6Var.c.E(i3);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((zj6) obj).S.f1(i3 + 8);
                return;
            case 11:
                p6b p6bVar = (p6b) obj;
                boolean contains = p6bVar.e.contains(Integer.valueOf(i3));
                ArrayList arrayList = p6bVar.e;
                if (contains) {
                    if (arrayList.size() > 1) {
                        p6bVar.e.remove(Integer.valueOf(i3));
                    } else {
                        return;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i3));
                }
                gl.d0(p6bVar.b, new zf7(p6bVar, (byte) 1));
                return;
            case 12:
                sr7 sr7Var = (sr7) obj;
                if (sr7Var.e.getAdapter() instanceof n04) {
                    t14 t14Var = ((n04) sr7Var.e.getAdapter()).c;
                    if ((i3 == 1 || i3 == 2) && t14Var.x1) {
                        if (i3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        t14Var.P(true, false, z);
                        return;
                    } else if (i3 == 0 && t14Var.w1) {
                        t14Var.P(true, true, false);
                        return;
                    }
                }
                sr7Var.e.x(i3, false);
                return;
            case 13:
                g48 g48Var = (g48) obj;
                m8 m8Var = g48Var.J;
                if (m8Var != null && m8Var.isShowing()) {
                    g48Var.J.d(true);
                }
                if (i3 == 0) {
                    ij.I(g48Var.getParentActivity(), g48Var.G.a(), new c48(g48Var, (byte) 2));
                    return;
                }
                g48Var.Z(g48Var.b, g48Var.c, true, 0);
                g48Var.finishFragment();
                return;
            case 14:
                u58 u58Var = (u58) obj;
                m8 m8Var2 = u58Var.n0;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    u58Var.n0.d(true);
                }
                if (i3 == 0) {
                    ij.I(u58Var.getParentActivity(), u58Var.V.a(), new m58(u58Var, (byte) 2));
                    return;
                } else {
                    u58Var.i0(0, true);
                    return;
                }
            case 15:
                k27 k27Var = (k27) obj;
                int i4 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    gl.d3(new o57(z3a.B(i3), k27.B0(k27Var.k), k27Var.e1(), keyboardButtonProto.getData(), (byte) 17));
                    return;
                }
                return;
            case 16:
                ((mk8) obj).b.x(i3, true);
                return;
            case 17:
                bgc bgcVar = (bgc) obj;
                if (bgcVar.V == null && view.getAlpha() != 0.0f) {
                    bgcVar.c(i3, true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                if (i3 == 0) {
                    vn8 vn8Var = profileActivity.O;
                    if (!vn8Var.F1) {
                        if (nfa.t0(vn8Var.getClosestTab())) {
                            vn8 vn8Var2 = profileActivity.O;
                            profileActivity.O.U0(vn8Var2.s1(vn8Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            return;
                        } else if (!profileActivity.getMessagesController().b5()) {
                            profileActivity.showDialog(new jh8((d) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                            t7b C = t7b.C(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            C.y = new un8(profileActivity);
                            C.Q(null);
                            return;
                        }
                    }
                }
                if (nfa.t0(profileActivity.O.getClosestTab())) {
                    long a = profileActivity.a();
                    vn8 vn8Var3 = profileActivity.O;
                    int s1 = vn8Var3.s1(vn8Var3.getClosestTab());
                    String v = profileActivity.getMessagesController().M1().v(s1, a);
                    b61 b61Var = profileActivity.D5;
                    if (b61Var != null) {
                        b61Var.run();
                        profileActivity.D5 = null;
                    }
                    m21.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<k27> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i5 = 0; i5 < actionModeSelected.size(); i5++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i5).l;
                            if (storyItem != null) {
                                arrayList2.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.E(false);
                    if (!arrayList2.isEmpty()) {
                        o57 o57Var = new o57(profileActivity, a, s1, arrayList2, (byte) 16);
                        profileActivity.getMessagesController().M1().e0(s1, a, arrayList2);
                        u21.b0(profileActivity).K(2131623980, gl.T2(k96.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", v)), k96.M0(2131743646, null), o57Var).j();
                        return;
                    }
                    return;
                }
                long e = profileActivity.getUserConfig().e();
                b61 b61Var2 = profileActivity.D5;
                if (b61Var2 != null) {
                    b61Var2.run();
                    profileActivity.D5 = null;
                }
                m21.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ArrayList arrayList3 = new ArrayList();
                SparseArray<k27> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i = 0;
                    for (int i6 = 0; i6 < actionModeSelected2.size(); i6++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i6).l;
                        if (storyItem2 != null) {
                            arrayList3.add(storyItem2);
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                profileActivity.O.E(false);
                if (z2) {
                    profileActivity.O.f1(8);
                }
                if (!arrayList3.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList3.size()];
                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList3.get(i7);
                        zArr2[i7] = storyItem3.pinned;
                        storyItem3.pinned = z2;
                    }
                    profileActivity.getMessagesController().M1().q0(e, arrayList3, false);
                    boolean[] zArr3 = {false};
                    boolean z5 = z2;
                    profileActivity.D5 = new b61(profileActivity, e, arrayList3, z2, (byte) 9);
                    o77 o77Var = new o77(profileActivity, zArr3, arrayList3, zArr2, e, (byte) 12);
                    if (z5) {
                        j = u21.b0(profileActivity).L(2131623990, k96.G(i, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743646, null), o77Var).j();
                    } else {
                        j = u21.b0(profileActivity).J(2131623980, k96.G(i, "StoryArchived", new Object[0]), k96.M0(2131743646, null), 5000, false, o77Var).j();
                    }
                    j.v = new ll8(profileActivity, zArr3, (byte) 9);
                    return;
                }
                return;
            case 19:
                ew8 ew8Var = ((rv8) obj).h;
                r35 r35Var = ew8Var.d;
                ArrayList arrayList4 = ew8Var.n;
                if (i3 >= 0 && i3 < arrayList4.size()) {
                    ew8Var.w = true;
                    ew8Var.h.a(i3, true);
                    int i8 = ((pv8) arrayList4.get(i3)).d;
                    int K0 = r35Var.K0();
                    if ((r35Var.m(i8) == null && Math.abs(i8 - K0) > ew8Var.r * 9) || !gba.c()) {
                        ew8Var.c.D0();
                        cu6 cu6Var = ew8Var.f;
                        if (K0 < i8) {
                            i2 = 0;
                        }
                        cu6Var.b = i2;
                        cu6Var.k(i8, 0, false, false);
                        return;
                    }
                    u26 u26Var = new u26(ew8Var.getContext());
                    u26Var.a = ((pv8) arrayList4.get(i3)).d;
                    r35Var.v0(u26Var);
                    return;
                }
                return;
            case 20:
                wi wiVar = (wi) obj;
                EditTextBoldCursor editTextBoldCursor = wiVar.m1;
                gl.t1(editTextBoldCursor);
                wiVar.n1.a(Integer.valueOf(i3), editTextBoldCursor.getText().toString());
                wiVar.dismiss();
                return;
            case 21:
                ((hd9) obj).Q.Y3(i3);
                return;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i9 = ScrollSlidingTextTabStrip.p0;
                scrollSlidingTextTabStrip.g(view, i3, scrollSlidingTextTabStrip.a.indexOfChild(view));
                return;
            case 23:
                jna jnaVar = ((kna) obj).e2;
                int i10 = jna.w;
                jnaVar.a(i3);
                return;
            case 24:
                ((jna) obj).a(i3);
                return;
            case 25:
                uxa uxaVar = (uxa) obj;
                uxaVar.i0.E(i3);
                uxaVar.o0(i3, true);
                return;
            case 26:
                k6c k6cVar = (k6c) obj;
                int i11 = k6cVar.b.i.q;
                if (i11 == 2) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    oh0.e().b(false);
                    k6cVar.updateAppUpdateViews(i3, true);
                    return;
                } else if (i11 == 3) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    oh0 e2 = oh0.e();
                    if (e2.j) {
                        HttpGetFileTask httpGetFileTask = e2.l;
                        if (httpGetFileTask != null) {
                            httpGetFileTask.cancel(false);
                        }
                        e2.j = false;
                        kk7.e().k(296, new Object[0]);
                    }
                    k6cVar.updateAppUpdateViews(i3, true);
                    return;
                } else {
                    File g = a.a.g();
                    if (g != null) {
                        gl.s2(g, "Telegram.apk", "application/vnd.android.package-archive", k6cVar.d, null, false);
                        return;
                    }
                    return;
                }
            default:
                lqc lqcVar = (lqc) obj;
                EditText editText = lqcVar.a;
                TextView[] textViewArr = lqcVar.O;
                TextView textView = textViewArr[i3];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i3].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    lqcVar.a();
                    lqcVar.a();
                    Runnable runnable = lqcVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public v0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
