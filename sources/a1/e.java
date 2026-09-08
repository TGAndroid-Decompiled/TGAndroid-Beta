package a1;

import a3.l0;
import ah.h1;
import ah.k1;
import ah.m1;
import ah.u0;
import ah.x;
import ah.x0;
import ah.z;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.x1;
import bi.c6;
import bi.d8;
import bi.e1;
import bi.e3;
import bi.f5;
import bi.f8;
import bi.g8;
import bi.gb;
import bi.j0;
import bi.l8;
import bi.m8;
import bi.n5;
import bi.o5;
import bi.ob;
import bi.pb;
import bi.q2;
import bi.s6;
import bi.t1;
import bi.t8;
import bi.u8;
import bi.x2;
import bi.z0;
import com.google.android.gms.internal.vision.e2;
import di.bc;
import di.f4;
import di.ic;
import di.ja;
import di.ka;
import di.kc;
import di.o8;
import di.oc;
import di.pc;
import e2.d0;
import i2.b0;
import i2.c0;
import i2.f0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ProfileActivity;
import sg.a1;
import v0.i;
import v0.o;
import w7.x5;
public final class e implements Runnable {
    public final int f43a;
    public final Object f44b;
    public final Object f45c;

    public e(int i10, Object obj, Object obj2) {
        this.f43a = i10;
        this.f44b = obj;
        this.f45c = obj2;
    }

    @Override
    public final void run() {
        z5[] z5VarArr;
        z5[] z5VarArr2;
        t1 t1Var;
        long j3;
        int i10;
        int i11;
        oc ocVar;
        ob obVar;
        String str = null;
        boolean z10 = true;
        switch (this.f43a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f44b, (Exception) this.f45c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f44b, (p) this.f45c);
                return;
            case 2:
                x1 x1Var = (x1) this.f45c;
                String str2 = d0.f8765a;
                f0 f0Var = ((c0) ((l0) ((pf.b) this.f44b).f44074c)).f11497a;
                f0Var.f11543h0 = x1Var;
                f0Var.f11552m.e(25, new b0(x1Var));
                return;
            case 3:
                String str3 = d0.f8765a;
                j2.f fVar = ((c0) ((l0) ((pf.b) this.f44b).f44074c)).f11497a.f11559s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new i0.b(p5, (Exception) this.f45c, 13));
                return;
            case 4:
                String str4 = d0.f8765a;
                j2.f fVar2 = ((c0) ((l0) ((pf.b) this.f44b).f44074c)).f11497a.f11559s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1019, new i0.b(p10, (String) this.f45c, 20));
                return;
            case 5:
                ah.b0 b0Var = (ah.b0) this.f44b;
                z5 z5Var = (z5) this.f45c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b0Var.f460n.getText());
                for (z5 z5Var2 : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = b0Var.f460n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        b0Var.f460n.getText().delete(spanStart, spanEnd);
                        int i12 = spanEnd - spanStart;
                        x xVar = b0Var.f460n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i12;
                        }
                        xVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 6:
                ah.b0 b0Var2 = (ah.b0) this.f44b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f45c;
                if (b0Var2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    m1.f(-b0Var2.M, b0Var2.R, b0Var2.Q);
                    return;
                }
                String str5 = tL_error.text;
                if (str5.equals("REACTIONS_TOO_MANY")) {
                    str5 = LocaleController.formatPluralString("ReactionMaxCountError", b0Var2.J, new Object[0]);
                }
                yc.a0(b0Var2).t(str5, null).j();
                return;
            case 7:
                z5 z5Var3 = (z5) this.f45c;
                ah.b0 b0Var3 = ((z) this.f44b).f738e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b0Var3.f460n.getText());
                for (z5 z5Var4 : (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = b0Var3.f460n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        b0Var3.f460n.getText().delete(spanStart2, spanEnd2);
                        int i13 = spanEnd2 - spanStart2;
                        x xVar2 = b0Var3.f460n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i13;
                        }
                        xVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 8:
                u0 u0Var = (u0) this.f44b;
                fk0 fk0Var = (fk0) this.f45c;
                u0Var.f706l = true;
                u0Var.f697a.invalidate();
                fk0Var.f26109b1 = false;
                fk0Var.invalidate();
                u0Var.c(true);
                return;
            case 9:
                x0 x0Var = (x0) this.f44b;
                ah.c cVar = (ah.c) this.f45c;
                x0Var.getText().delete(x0Var.getText().getSpanStart(cVar), x0Var.getText().getSpanEnd(cVar));
                x0Var.setCursorVisible(true);
                x0Var.setLongClickable(true);
                return;
            case 10:
                k1 k1Var = (k1) this.f44b;
                h1 h1Var = (h1) this.f45c;
                k1Var.getClass();
                TLRPC.ReactionCount reactionCount = h1Var.f564a;
                a0 a0Var = k1Var.f640z;
                if (e2.u(a0Var)) {
                    ((n4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                h1Var.Y.c(false);
                k1Var.S = null;
                k1Var.T = false;
                k1Var.U = null;
                return;
            case 11:
                ViewGroup container = (ViewGroup) this.f44b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 12:
                ((i) this.f44b).onError(this.f45c);
                return;
            case 13:
                ((i) this.f44b).onResult((o) this.f45c);
                return;
            case 14:
                ((pb) this.f44b).H(ProfileActivity.m4(((e1) this.f45c).f2927c));
                return;
            case 15:
                e3 e3Var = (e3) this.f44b;
                AndroidUtilities.addToClipboard(((z0) this.f45c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(e3Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 16:
                e3 e3Var2 = (e3) this.f44b;
                e1 e1Var = (e1) this.f45c;
                long j10 = e1Var.f2927c;
                o5 o5Var = e3Var2.f2934i0;
                if (j10 != UserConfig.getInstance(o5Var.C2).getClientUserId() && ((t1Var = e3Var2.f2933h0.A0) == null || j10 != DialogObject.getPeerDialogId(t1Var.i()))) {
                    if (o5Var.O3 != null) {
                        for (int i14 = 0; i14 < o5Var.O3.peers.size(); i14++) {
                            if (j10 != DialogObject.getPeerDialogId(o5Var.O3.peers.get(i14).peer)) {
                            }
                        }
                    }
                    Context context = e3Var2.getContext();
                    long j11 = e1Var.f2927c;
                    j0 j0Var = new j0(0, e3Var2, e1Var);
                    bi.b bVar = new bi.b();
                    f3 f3Var = new f3(1, context, (f6) bVar, false);
                    f3Var.fixNavigationBar();
                    LinearLayout f7 = wl.f(context, 1);
                    TextView g10 = w1.g(context, 1, 20.0f);
                    g10.setTextColor(bVar.G0(j6.f20797j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f7.addView(g10, x5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    l4 l4Var = new l4(context, bVar);
                    l4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f7.addView(l4Var, x5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final z1 z1Var = new z1(4, 21, context, bVar, true);
                    mp checkBoxRound = z1Var.getCheckBoxRound();
                    int i15 = j6.V6;
                    int i16 = j6.f20746g7;
                    int i17 = j6.f20819k7;
                    checkBoxRound.b(i15, i16, i17);
                    z1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    z1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.z1 z1Var2 = z1Var;
                                    z1Var2.c(!z1Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.z1 z1Var3 = z1Var;
                                    z1Var3.c(!z1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.z1 z1Var4 = z1Var;
                                    z1Var4.c(!z1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i18 = j6.f20780i6;
                    z1Var.setBackground(j6.f0(bVar.G0(i18), 2, -1));
                    f7.addView(z1Var, x5.n(-1, -2));
                    final z1 z1Var2 = new z1(4, 21, context, bVar, true);
                    z1Var2.getCheckBoxRound().b(i15, i16, i17);
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    z1Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.z1 z1Var22 = z1Var2;
                                    z1Var22.c(!z1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.z1 z1Var3 = z1Var2;
                                    z1Var3.c(!z1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.z1 z1Var4 = z1Var2;
                                    z1Var4.c(!z1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    z1Var2.setBackground(j6.f0(bVar.G0(i18), 2, -1));
                    f7.addView(z1Var2, x5.n(-1, -2));
                    final z1 z1Var3 = new z1(4, 21, context, bVar, true);
                    z1Var3.getCheckBoxRound().b(i15, i16, i17);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    z1Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.z1 z1Var22 = z1Var3;
                                    z1Var22.c(!z1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.z1 z1Var32 = z1Var3;
                                    z1Var32.c(!z1Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.z1 z1Var4 = z1Var3;
                                    z1Var4.c(!z1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    z1Var3.setBackground(j6.f0(bVar.G0(i18), 2, -1));
                    f7.addView(z1Var3, x5.n(-1, -2));
                    e9 e9Var = new e9(context, bVar);
                    e9Var.setBackgroundColor(-16777216);
                    e9Var.setFixedSize(12);
                    f7.addView(e9Var, x5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    di.d dVar = new di.d(context, bVar, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new bi.l0(z1Var, z1Var2, z1Var3, j0Var, f3Var, 0));
                    frameLayout.addView(dVar, x5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f7.addView(frameLayout, x5.n(-1, -2));
                    f3Var.setCustomView(f7);
                    f3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = e3Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.f2925a));
                ConnectionsManager.getInstance(e3Var2.N).sendRequest(deletegroupcallmessages, null);
                e3Var2.c(e1Var.f2925a);
                return;
            case 17:
                t1 t1Var2 = (t1) this.f44b;
                ArrayList arrayList = (ArrayList) this.f45c;
                t1Var2.getClass();
                int size = arrayList.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(t1Var2.f3745e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f19913id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 18:
                ((t1) this.f44b).F.remove((String) this.f45c);
                return;
            case 19:
                o5 o5Var2 = (o5) this.f44b;
                f4 f4Var = (f4) this.f45c;
                o5Var2.removeView(f4Var);
                if (o5Var2.f3441d2 == f4Var) {
                    o5Var2.f3441d2 = null;
                    return;
                }
                return;
            case 20:
                o5 o5Var3 = (o5) this.f44b;
                pc E = pc.E((Activity) this.f45c, o5Var3.C2);
                n5 n5Var = o5Var3.M2;
                if (n5Var != null && (obVar = (ob) n5Var.f3393c) != null) {
                    j3 = obVar.currentPosition;
                } else {
                    j3 = 0;
                }
                File h = o5Var3.O1.h();
                TL_stories.StoryItem storyItem = o5Var3.O1.f3337a;
                o8 o8Var = new o8();
                o8Var.f7796n = true;
                o8Var.f7808t = storyItem.media;
                int i20 = o8Var.f7768a;
                o8Var.f7802q = MessagesController.getInstance(i20).getPeer(storyItem.dialogId);
                o8Var.f7804r = storyItem.f20134id;
                o8Var.f7806s = storyItem.caption;
                o8Var.L = h;
                o8Var.M = false;
                o8Var.f7792k0 = 720;
                o8Var.f7794l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    o8Var.K = false;
                    if (h != null) {
                        o8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    o8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i21);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    o8Var.f7792k0 = documentAttribute.f19903w;
                                    o8Var.f7794l0 = documentAttribute.h;
                                    o8Var.f7787i = documentAttribute.duration;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str6 = storyItem.firstFramePath;
                        if (str6 != null) {
                            o8Var.N = str6;
                        } else if (document2.thumbs != null) {
                            for (int i22 = 0; i22 < storyItem.media.document.thumbs.size(); i22++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i22);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    o8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i20).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        o8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                o8Var.A();
                o8Var.e(storyItem);
                ic d = kc.d(o5Var3.J0);
                RectF rectF = E.H;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f7887f;
                int i23 = E.f7876c;
                if (!E.d) {
                    if (MessagesController.getInstance(i23).isFrozen()) {
                        org.telegram.ui.b.b(i23);
                    } else {
                        E.f7934u0 = false;
                        E.f7883e = false;
                        E.B2 = false;
                        if (windowManager != null && (ocVar = E.f7910n) != null && ocVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.f7910n, layoutParams);
                            windowManager.addView(E.f7910n, layoutParams);
                            E.g0();
                        }
                        E.K1 = o8Var;
                        ja.a(i23, o8Var);
                        o8 o8Var2 = E.K1;
                        if (o8Var2 != null && o8Var2.K) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        E.O1 = i10;
                        E.f7928s0.f7022g = false;
                        if (d != null) {
                            E.F = d;
                            E.J = d.f7510a;
                            rectF.set(d.f7512c);
                            E.G = d.f7511b;
                            E.F.e();
                        } else {
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                        }
                        E.f7923r.c();
                        bc bcVar = E.f7894h0;
                        int i24 = E.J;
                        if (i24 != 1 && i24 != 0) {
                            i11 = -14737633;
                        } else {
                            i11 = 0;
                        }
                        bcVar.setBackgroundColor(i11);
                        E.f7923r.setTranslationX(0.0f);
                        E.f7923r.setTranslationY(0.0f);
                        E.f7923r.b(0.0f);
                        E.f7923r.setScaleX(1.0f);
                        E.f7923r.setScaleY(1.0f);
                        E.K = 0.0f;
                        AndroidUtilities.lockOrientation(E.f7872b, 1);
                        o8 o8Var3 = E.K1;
                        if (o8Var3 != null) {
                            E.f7878c1.setText(o8Var3.C0);
                        }
                        E.L(new ka(E, 7), j3);
                        E.f7874b1.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.f7937v0 = 0L;
                        E.f7941w0 = "";
                    }
                }
                E.Q = new q2(o5Var3, 12);
                E.R = new x2(0, o5Var3, E);
                return;
            case 21:
                f5 f5Var = (f5) this.f44b;
                f5Var.getClass();
                ((gb) f5Var.f2999l.Q1).h(new a1(((pb) this.f45c).f3572f, 14, false));
                return;
            case 22:
                c6 c6Var = (c6) this.f44b;
                c6Var.h = null;
                s6 s6Var = c6Var.f2846n;
                s6Var.Q = false;
                s6Var.O.f2892c = ((String) this.f45c).toLowerCase();
                s6.b(s6Var);
                return;
            case 23:
                Utilities.Callback callback = (Utilities.Callback) this.f44b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f45c;
                if (callback != null) {
                    if (tL_error2 != null) {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                    return;
                }
                return;
            case 24:
                d8 d8Var = (d8) this.f44b;
                TLObject tLObject = (TLObject) this.f45c;
                g8 g8Var = d8Var.f3310q;
                int i25 = d8Var.f3298c;
                ArrayList arrayList2 = d8Var.f3302i;
                d8Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i25).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i25).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i26);
                        i26++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        MessageObject messageObject = new MessageObject(i25, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        d8Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    d8Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        d8Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    d8Var.H = str;
                    d8Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(g8Var);
                    AndroidUtilities.runOnUIThread(g8Var);
                    return;
                }
                return;
            case 25:
                f8 f8Var = (f8) this.f44b;
                ArrayList arrayList5 = f8Var.h;
                arrayList5.clear();
                arrayList5.addAll((List) this.f45c);
                f8Var.d = true;
                f8Var.f3009e = false;
                f8Var.d();
                NotificationCenter.getInstance(f8Var.f3006a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f8Var.f3007b), f8Var);
                return;
            case 26:
                f8 f8Var2 = (f8) this.f44b;
                TLObject tLObject2 = (TLObject) this.f45c;
                ArrayList arrayList6 = f8Var2.f3011g;
                ArrayList arrayList7 = f8Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                    int size3 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i27);
                        i27++;
                        arrayList8.add(m8.a(tL_storyAlbum));
                    }
                    arrayList7.clear();
                    arrayList7.addAll(arrayList8);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList8);
                    f8Var2.f3010f = true;
                    f8Var2.f3009e = false;
                    f8Var2.f(true);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    f8Var2.f3010f = true;
                    f8Var2.f3009e = false;
                    NotificationCenter.getInstance(f8Var2.f3006a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f8Var2.f3007b), f8Var2);
                    return;
                } else {
                    return;
                }
            case 27:
                l8 l8Var = (l8) this.f44b;
                l8Var.getClass();
                ((Utilities.Callback) this.f45c).run(l8Var);
                return;
            case 28:
                MessagesController.getInstance(((t8) this.f44b).M.f3832a).getStoriesController().Z((TL_stories.TL_updateStory) this.f45c);
                return;
            default:
                t8 t8Var = (t8) this.f44b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f45c;
                o8 o8Var4 = t8Var.f3767c;
                o8Var4.f7813w = true;
                u8 u8Var = t8Var.M;
                if (u8Var.n(tL_error3)) {
                    o8Var4.f7815x = null;
                } else {
                    o8Var4.f7815x = tL_error3;
                }
                t8Var.d = true;
                t8Var.I = true;
                t8Var.H = true;
                u8Var.f3851w.d(o8Var4);
                return;
        }
    }
}
