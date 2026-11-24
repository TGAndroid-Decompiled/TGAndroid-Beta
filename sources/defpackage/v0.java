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

    public v0(int i, k47 k47Var) {
        this.a = (byte) 15;
        this.b = i;
        this.c = k47Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        int i;
        u31 j;
        byte b = this.a;
        int i2 = 1;
        int i3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((qac) obj).a(Integer.valueOf(i3));
                return;
            case 1:
                ((m) obj).a(Integer.valueOf(i3));
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj;
                boolean z3 = !zArr[i3];
                zArr[i3] = z3;
                ((oh2) view).c(z3, true);
                return;
            case 3:
                ((yv1) obj).l8(i3);
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
                w34 w34Var = (w34) obj;
                if (w34Var.n != null && i3 != w34Var.s) {
                    c6c c6cVar = w34Var.r;
                    if (c6cVar != null) {
                        c6cVar.A = i3;
                    }
                    w34Var.b(i3, true);
                    w34Var.n.a(Integer.valueOf(i3));
                    return;
                }
                return;
            case 7:
                ((d85) obj).l1.x(i3, true);
                return;
            case 8:
                d85 d85Var = (d85) ((db5) obj).d;
                d85Var.E0(i3);
                d85Var.dismiss();
                return;
            case 9:
                bj6 bj6Var = (bj6) obj;
                ValueAnimator valueAnimator = bj6Var.c.T;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    igc igcVar = bj6Var.c;
                    if (!igcVar.I) {
                        if (igcVar.getCurrentPosition() == i3) {
                            d b0 = bj6Var.b0();
                            if (b0 instanceof aj6) {
                                ((aj6) b0).u();
                                return;
                            }
                            return;
                        }
                        bj6Var.o0(i3, true);
                        bj6Var.c.E(i3);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((cm6) obj).S.f1(i3 + 8);
                return;
            case 11:
                r8b r8bVar = (r8b) obj;
                boolean contains = r8bVar.e.contains(Integer.valueOf(i3));
                ArrayList arrayList = r8bVar.e;
                if (contains) {
                    if (arrayList.size() > 1) {
                        r8bVar.e.remove(Integer.valueOf(i3));
                    } else {
                        return;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i3));
                }
                gm.d0(r8bVar.b, new ci7(r8bVar, (byte) 1));
                return;
            case 12:
                tt7 tt7Var = (tt7) obj;
                if (tt7Var.e.getAdapter() instanceof y14) {
                    e34 e34Var = ((y14) tt7Var.e.getAdapter()).c;
                    if ((i3 == 1 || i3 == 2) && e34Var.x1) {
                        if (i3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        e34Var.O(true, false, z);
                        return;
                    } else if (i3 == 0 && e34Var.w1) {
                        e34Var.O(true, true, false);
                        return;
                    }
                }
                tt7Var.e.x(i3, false);
                return;
            case 13:
                j68 j68Var = (j68) obj;
                m8 m8Var = j68Var.J;
                if (m8Var != null && m8Var.isShowing()) {
                    j68Var.J.d(true);
                }
                if (i3 == 0) {
                    ik.I(j68Var.getParentActivity(), j68Var.G.a(), new e68(j68Var, (byte) 2));
                    return;
                }
                j68Var.a0(j68Var.b, j68Var.c, true, 0);
                j68Var.finishFragment();
                return;
            case 14:
                w78 w78Var = (w78) obj;
                m8 m8Var2 = w78Var.n0;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    w78Var.n0.d(true);
                }
                if (i3 == 0) {
                    ik.I(w78Var.getParentActivity(), w78Var.V.a(), new o78(w78Var, (byte) 2));
                    return;
                } else {
                    w78Var.j0(0, true);
                    return;
                }
            case 15:
                k47 k47Var = (k47) obj;
                int i4 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    gm.c3(new o77(a6a.B(i3), k47.B0(k47Var.k), k47Var.e1(), keyboardButtonProto.getData(), (byte) 17));
                    return;
                }
                return;
            case 16:
                ((om8) obj).b.x(i3, true);
                return;
            case 17:
                cic cicVar = (cic) obj;
                if (cicVar.V == null && view.getAlpha() != 0.0f) {
                    cicVar.c(i3, true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                if (i3 == 0) {
                    wp8 wp8Var = profileActivity.O;
                    if (!wp8Var.F1) {
                        if (nha.t0(wp8Var.getClosestTab())) {
                            wp8 wp8Var2 = profileActivity.O;
                            profileActivity.O.U0(wp8Var2.s1(wp8Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            return;
                        } else if (!profileActivity.getMessagesController().e5()) {
                            profileActivity.showDialog(new kj8((d) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                            v9b C = v9b.C(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            C.y = new vp8(profileActivity);
                            C.Q(null);
                            return;
                        }
                    }
                }
                if (nha.t0(profileActivity.O.getClosestTab())) {
                    long a = profileActivity.a();
                    wp8 wp8Var3 = profileActivity.O;
                    int s1 = wp8Var3.s1(wp8Var3.getClosestTab());
                    String v = profileActivity.getMessagesController().N1().v(s1, a);
                    i71 i71Var = profileActivity.I5;
                    if (i71Var != null) {
                        i71Var.run();
                        profileActivity.I5 = null;
                    }
                    u31.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<k47> actionModeSelected = profileActivity.O.getActionModeSelected();
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
                        o77 o77Var = new o77(profileActivity, a, s1, arrayList2, (byte) 16);
                        profileActivity.getMessagesController().N1().e0(s1, a, arrayList2);
                        c41.b0(profileActivity).K(2131623980, gm.S2(jb6.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", v)), jb6.M0(2131743572, null), o77Var).j();
                        return;
                    }
                    return;
                }
                long e = profileActivity.getUserConfig().e();
                i71 i71Var2 = profileActivity.I5;
                if (i71Var2 != null) {
                    i71Var2.run();
                    profileActivity.I5 = null;
                }
                u31.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ArrayList arrayList3 = new ArrayList();
                SparseArray<k47> actionModeSelected2 = profileActivity.O.getActionModeSelected();
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
                    profileActivity.getMessagesController().N1().q0(e, arrayList3, false);
                    boolean[] zArr3 = {false};
                    boolean z5 = z2;
                    profileActivity.I5 = new i71(profileActivity, e, arrayList3, z2, (byte) 9);
                    r97 r97Var = new r97(profileActivity, zArr3, arrayList3, zArr2, e, (byte) 12);
                    if (z5) {
                        j = c41.b0(profileActivity).L(2131623990, jb6.G(i, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743572, null), r97Var).j();
                    } else {
                        j = c41.b0(profileActivity).J(2131623980, jb6.G(i, "StoryArchived", new Object[0]), jb6.M0(2131743572, null), 5000, false, r97Var).j();
                    }
                    j.w = new mn8(profileActivity, zArr3, (byte) 11);
                    return;
                }
                return;
            case 19:
                gy8 gy8Var = ((sx8) obj).h;
                q55 q55Var = gy8Var.d;
                ArrayList arrayList4 = gy8Var.n;
                if (i3 >= 0 && i3 < arrayList4.size()) {
                    gy8Var.w = true;
                    gy8Var.h.a(i3, true);
                    int i8 = ((qx8) arrayList4.get(i3)).d;
                    int K0 = q55Var.K0();
                    if ((q55Var.m(i8) == null && Math.abs(i8 - K0) > gy8Var.r * 9) || !gda.c()) {
                        gy8Var.c.D0();
                        cw6 cw6Var = gy8Var.f;
                        if (K0 < i8) {
                            i2 = 0;
                        }
                        cw6Var.b = i2;
                        cw6Var.l(i8, 0, false, false);
                        return;
                    }
                    v46 v46Var = new v46(gy8Var.getContext());
                    v46Var.a = ((qx8) arrayList4.get(i3)).d;
                    q55Var.v0(v46Var);
                    return;
                }
                return;
            case 20:
                wj wjVar = (wj) obj;
                EditTextBoldCursor editTextBoldCursor = wjVar.m1;
                gm.t1(editTextBoldCursor);
                wjVar.n1.a(Integer.valueOf(i3), editTextBoldCursor.getText().toString());
                wjVar.dismiss();
                return;
            case 21:
                ((jf9) obj).Q.Y3(i3);
                return;
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i9 = ScrollSlidingTextTabStrip.p0;
                scrollSlidingTextTabStrip.g(view, i3, scrollSlidingTextTabStrip.a.indexOfChild(view));
                return;
            case 23:
                jpa jpaVar = ((kpa) obj).e2;
                int i10 = jpa.w;
                jpaVar.a(i3);
                return;
            case 24:
                ((jpa) obj).a(i3);
                return;
            case 25:
                xza xzaVar = (xza) obj;
                xzaVar.i0.E(i3);
                xzaVar.p0(i3, true);
                return;
            case 26:
                l8c l8cVar = (l8c) obj;
                int i11 = l8cVar.b.i.q;
                if (i11 == 2) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    oi0.e().b(false);
                    l8cVar.updateAppUpdateViews(i3, true);
                    return;
                } else if (i11 == 3) {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    oi0 e2 = oi0.e();
                    if (e2.j) {
                        HttpGetFileTask httpGetFileTask = e2.l;
                        if (httpGetFileTask != null) {
                            httpGetFileTask.cancel(false);
                        }
                        e2.j = false;
                        nm7.e().k(298, new Object[0]);
                    }
                    l8cVar.updateAppUpdateViews(i3, true);
                    return;
                } else {
                    File g = a.a.g();
                    if (g != null) {
                        gm.s2(g, "Telegram.apk", "application/vnd.android.package-archive", l8cVar.d, null, false);
                        return;
                    }
                    return;
                }
            default:
                nsc nscVar = (nsc) obj;
                EditText editText = nscVar.a;
                TextView[] textViewArr = nscVar.O;
                TextView textView = textViewArr[i3];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i3].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    nscVar.a();
                    nscVar.a();
                    Runnable runnable = nscVar.r;
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
