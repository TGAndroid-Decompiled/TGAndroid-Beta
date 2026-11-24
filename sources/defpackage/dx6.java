package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class dx6 implements lx6, us2, ed, z97, d39, yc3, px2, h5b, y48, OnFailureListener, gj, js4, wi3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public dx6(ae8 ae8Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = (byte) 22;
        this.b = ae8Var;
        this.c = tL_messageMediaPoll;
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final File a() {
        byte b = this.a;
        Object obj = this.c;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        switch (b) {
            case 17:
                Drawable[] drawableArr = PhotoViewer.f9;
                ba4.G(photoViewer.U);
                return ba4.J((TLObject) obj, null, true, true);
            default:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                ba4.G(photoViewer.U);
                return ba4.M((TLRPC.Message) obj, false, true);
        }
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                su6 su6Var = (su6) obj2;
                ad8 ad8Var = (ad8) obj;
                tv6 tv6Var = (tv6) ((ox6) obj3).a.get();
                if (tv6Var != null && !tv6Var.i()) {
                    am5 c = jie.c(Boolean.TRUE);
                    pv6 pv6Var = new pv6(tv6Var, su6Var, false);
                    c.b(new tq4(c, pv6Var, (byte) 0), new ge2(tv6Var, (byte) 3));
                    return;
                }
                return;
            default:
                kp kpVar = (kp) obj3;
                ((vx6) obj).j(kpVar.b, (rx6) kpVar.c, (fr6) obj2);
                return;
        }
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        vs2 vs2Var = (vs2) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        if (vs2Var != null) {
            vs2Var.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(w5b w5bVar, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, a5b a5bVar, kya kyaVar) {
        boolean z5;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                y28 y28Var = (y28) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = na7.q1(y28Var.s2).h1(storyItem.dialogId);
                tL_stories_editStory.id = storyItem.id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = w5bVar.b;
                ConnectionsManager.getInstance(y28Var.s2).sendRequest(tL_stories_editStory, new rt0(y28Var, a5bVar, storyItem, w5bVar, (byte) 14));
                return;
            default:
                s28 s28Var = (s28) obj2;
                y5b y5bVar = (y5b) obj;
                y28 y28Var2 = s28Var.x;
                x28 x28Var = y28Var2.E1;
                TL_stories.StoryItem storyItem2 = x28Var.a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 != z3) {
                    na7.q1(y28Var2.s2).M1().r0(y28Var2.r1, y28Var2.l1, z3, null);
                }
                TL_stories.StoryItem storyItem3 = x28Var.a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(y28Var2.s2).sendRequest(togglegroupcallsettings, new hj7(s28Var, y5bVar, (byte) 6));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        ((NotificationsCustomSettingsActivity) this.b).j0((Context) this.c, view, i, f, f2);
    }

    @Override
    public final void h(mt8 mt8Var) {
        ((yc3) this.b).h(mt8Var);
        ((yc3) this.c).h(mt8Var);
    }

    @Override
    public final Object m(Object obj) {
        ci8 ci8Var = (ci8) this.c;
        Void r8 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((di8) this.b).d.n;
        premiumPreviewFragment.o0.d(0, 0.0f, 0, ci8Var.getMeasuredWidth(), -ci8Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.o0.f;
    }

    @Override
    public final void n(int i, int i2) {
        x48 x48Var = (x48) this.b;
        bg7 bg7Var = x48Var.e;
        ((y48) this.c).n(i, i2);
        TextView textView = x48Var.b;
        if (i2 > 0) {
            textView.setText("+" + i2);
        } else {
            textView.setText(String.valueOf(i2));
        }
        if (textView.getTag() == null) {
            AnimatorSet animatorSet = x48Var.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            textView.setTag(1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            x48Var.d = animatorSet2;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(x48Var.a, property, 0.0f));
            x48Var.d.setDuration(250L);
            x48Var.d.setInterpolator(new DecelerateInterpolator());
            x48Var.d.addListener(new l48(x48Var, (byte) 2));
            x48Var.d.start();
            return;
        }
        gl.r(bg7Var);
        gl.e3(bg7Var, 1000L);
    }

    @Override
    public final void onFailure(Exception exc) {
        e68 e68Var = (e68) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        e68Var.D0 = false;
        fa4.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof be7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && e68Var.isAttachedToWindow()) {
            gl.e3(new h18(e68Var, bitmap, (byte) 3), 2000L);
        } else {
            e68Var.E0 = true;
        }
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        lx6 lx6Var = (lx6) this.b;
        jx6 jx6Var = (jx6) this.c;
        if (tv6Var.i()) {
            return jie.c(new o6a(-100));
        }
        return g8c.h0((t56) lx6Var.p(tv6Var, su6Var, i), new lt2(tv6Var, su6Var, jx6Var, (byte) 17));
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        ji8 ji8Var = (ji8) this.b;
        String str = (String) this.c;
        ji8Var.getClass();
        long j = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            j = ((zc7) arrayList.get(i3)).a;
            ji8Var.r1.getSendMessagesHelper().q0(x3a.b(str, j, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        cj3Var.finishFragment();
        ym0.h(j);
        return true;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        ae8 ae8Var = (ae8) this.b;
        switch (b) {
            case 21:
                ie8 ie8Var = ae8Var.a;
                ie8Var.f0.c((TLRPC.TL_messageMediaToDo) obj);
                ie8Var.finishFragment();
                return;
            default:
                ie8 ie8Var2 = ae8Var.a;
                ie8Var2.f0.c((TLRPC.TL_messageMediaPoll) obj);
                ie8Var2.finishFragment();
                return;
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i2;
        byte b = this.a;
        int i3 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ((boolean[]) obj)[0] = true;
                ((kz6) obj2).Q();
                return;
            case 7:
                vx7 vx7Var = (vx7) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!vx7Var.w0) {
                    vx7Var.t1.clear();
                }
                vx7Var.u1.clear();
                bx7 bx7Var = vx7Var.C1;
                bx7Var.d.b1(vx7Var.F, vx7Var.G, vx7Var.H, zArr[0], null, null, bx7Var.b);
                vx7Var.finishFragment();
                return;
            case 8:
                int[] iArr = ((vx7) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(k96.M0(2131747301, null));
                return;
            case 10:
                ((vx7) obj2).t1((TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 11:
                p pVar = (p) obj2;
                pVar.c0 = true;
                pVar.b0.email_unconfirmed_pattern = (String) obj;
                pVar.O0();
                return;
            case 14:
                s28 s28Var = (s28) obj2;
                t76 t76Var = ((m8b) obj).B0;
                if (t76Var != null) {
                    if (!t76Var.w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = t76Var.f;
                        ConnectionsManager.getInstance(t76Var.e).sendRequest(discardgroupcall, new s76(t76Var, (byte) 0));
                        t76Var.h();
                        return;
                    }
                    return;
                }
                s28Var.x.u0();
                return;
            case 19:
                PhotoViewer photoViewer = ((p78) obj2).b;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.i2((ArrayList) obj);
                return;
            case 20:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer2 = ((p78) obj2).b;
                o98 o98Var = photoViewer2.d;
                ArrayList arrayList2 = photoViewer2.a7;
                ArrayList arrayList3 = photoViewer2.d7;
                ArrayList arrayList4 = photoViewer2.Y6;
                ArrayList arrayList5 = photoViewer2.e7;
                ArrayList arrayList6 = photoViewer2.f7;
                if (!o98Var.N()) {
                    photoViewer2.B(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i4 = photoViewer2.P4;
                    if (i4 >= 0 && i4 < arrayList4.size()) {
                        k27 k27Var = (k27) arrayList4.get(photoViewer2.P4);
                        if (k27Var.p4()) {
                            photoViewer2.B(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i5 = photoViewer2.w;
                            if (i5 != 0) {
                                arrayList7.add(Integer.valueOf(i5));
                            } else {
                                arrayList7.add(Integer.valueOf(k27Var.e1()));
                            }
                            if (cf3.B(k27.B0(k27Var.k)) && k27Var.k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(k27Var.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = na7.q1(photoViewer2.U).Y0(Integer.valueOf((int) (k27.B0(k27Var.k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            na7 q1 = na7.q1(photoViewer2.U);
                            long B0 = k27.B0(k27Var.k);
                            int I1 = k27.I1(k27Var.k);
                            boolean z = zArr2[0];
                            if (!k27Var.r1) {
                                if (k27.c5(k27Var.k)) {
                                    i3 = 9;
                                } else if (k27.a4(k27Var.k)) {
                                    i3 = 5;
                                } else {
                                    i2 = 0;
                                    q1.V(arrayList7, arrayList, encryptedChat, B0, I1, z, i2);
                                    return;
                                }
                            }
                            i2 = i3;
                            q1.V(arrayList7, arrayList, encryptedChat, B0, I1, z, i2);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i6 = photoViewer2.P4;
                    if (i6 >= 0 && i6 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer2.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            na7.q1(photoViewer2.U).V(arrayList9, null, null, k27.B0(message), message.quick_reply_shortcut_id, true, 0);
                            kk7.f(photoViewer2.U).k(39, new Object[0]);
                        }
                        if (photoViewer2.K0()) {
                            int i7 = (photoViewer2.z5 > 0L ? 1 : (photoViewer2.z5 == 0L ? 0 : -1));
                            int i8 = photoViewer2.U;
                            if (i7 > 0) {
                                na7.q1(i8).h0(null);
                            } else {
                                na7.q1(i8).x(-photoViewer2.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer2.B(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer2.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.id = photo.id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer2.z5 > 0) {
                                na7.q1(photoViewer2.U).h0(tL_inputPhoto);
                            }
                            ad7 Y = ad7.Y(photoViewer2.U);
                            Y.a.c(new sa7(Y, photoViewer2.z5, photo.id, (byte) 4));
                            arrayList2.remove(photoViewer2.P4);
                            photoViewer2.c7.remove(photoViewer2.P4);
                            photoViewer2.b7.remove(photoViewer2.P4);
                            arrayList3.remove(photoViewer2.P4);
                            arrayList6.remove(photoViewer2.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer2.B(false, false);
                            } else {
                                int i9 = photoViewer2.P4;
                                if (i9 >= arrayList6.size()) {
                                    i9 = arrayList6.size() - 1;
                                }
                                photoViewer2.P4 = -1;
                                photoViewer2.J1(i9);
                            }
                            if (message == null) {
                                kk7.f(photoViewer2.U).k(39, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer2.d != null) {
                    arrayList5.remove(photoViewer2.P4);
                    photoViewer2.d.A(photoViewer2.P4);
                    if (arrayList5.isEmpty()) {
                        photoViewer2.B(false, false);
                        return;
                    }
                    int i10 = photoViewer2.P4;
                    if (i10 >= arrayList5.size()) {
                        i10 = arrayList5.size() - 1;
                    }
                    photoViewer2.P4 = -1;
                    photoViewer2.J1(i10);
                    return;
                } else {
                    return;
                }
            case 25:
                ((PrivacyControlActivity) obj2).w0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().u(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new hj7(privacySettingsActivity, (ahb) obj, (byte) 10));
                return;
            case 27:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj2).w2((ag2[]) obj);
                return;
            case 28:
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = ((rn8) obj2).b;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getContactsController().i(arrayList10, true);
                user.contact = false;
                profileActivity.Y3(false, false);
                return;
            default:
                dq8 dq8Var = (dq8) obj2;
                p8c p8cVar = (p8c) obj;
                String obj3 = dq8Var.getText().toString();
                if (obj3.length() > 0 && obj3.length() <= 12) {
                    p8cVar.a(obj3);
                    hdVar.dismiss();
                    return;
                }
                gl.A3(dq8Var);
                return;
        }
    }

    @Override
    public final void y(mx2 mx2Var) {
        vx7 vx7Var = (vx7) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = vx7Var.Z[intValue];
        String str = mx2Var.d;
        if (intValue == 5) {
            vx7Var.s = str;
        } else {
            vx7Var.w = str;
        }
        editTextBoldCursor.setText(mx2Var.a);
    }

    public dx6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
