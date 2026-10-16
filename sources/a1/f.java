package a1;

import ah.g1;
import ah.j1;
import ah.l1;
import ah.t0;
import ah.w;
import ah.w0;
import ah.y;
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
import b2.b2;
import bi.a3;
import bi.e1;
import bi.f6;
import bi.g8;
import bi.h3;
import bi.h5;
import bi.i8;
import bi.j0;
import bi.j8;
import bi.jb;
import bi.l0;
import bi.o8;
import bi.p5;
import bi.p8;
import bi.q5;
import bi.r2;
import bi.rb;
import bi.sb;
import bi.t1;
import bi.w6;
import bi.z0;
import com.google.android.gms.internal.play_billing.k3;
import di.d4;
import di.dc;
import di.fa;
import di.fc;
import di.ga;
import di.jc;
import di.k8;
import di.kc;
import di.wb;
import e2.m0;
import fi.c2;
import i2.a0;
import i2.b0;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import n4.s;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import sg.y0;
import v0.i;
import w7.z5;
public final class f implements Runnable {
    public final int f41a;
    public final Object f42b;
    public final Object f43c;

    public f(int i10, Object obj, Object obj2) {
        this.f41a = i10;
        this.f42b = obj;
        this.f43c = obj2;
    }

    @Override
    public final void run() {
        b6[] b6VarArr;
        b6[] b6VarArr2;
        t1 t1Var;
        long j10;
        int i10;
        int i11;
        jc jcVar;
        rb rbVar;
        String str = null;
        boolean z10 = true;
        switch (this.f41a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f42b, (Exception) this.f43c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f42b, (p) this.f43c);
                return;
            case 2:
                ((a3.f) ((qf.b) this.f42b).f43098c).h.onVideoSizeChanged((b2) this.f43c);
                return;
            case 3:
                String str2 = m0.f8375a;
                s.h(((b0) ((a3.m0) ((s) this.f42b).f15746c)).f10929a.G, (i2.c) this.f43c);
                return;
            case 4:
                b2 b2Var = (b2) this.f43c;
                String str3 = m0.f8375a;
                h0 h0Var = ((b0) ((a3.m0) ((s) this.f42b).f15746c)).f10929a;
                h0Var.f11002k0 = b2Var;
                h0Var.f11005m.e(25, new a0(b2Var));
                return;
            case 5:
                String str4 = m0.f8375a;
                j2.f fVar = ((b0) ((a3.m0) ((s) this.f42b).f15746c)).f10929a.f11016s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1030, new c2(p5, (Exception) this.f43c, 28));
                return;
            case 6:
                String str5 = m0.f8375a;
                j2.f fVar2 = ((b0) ((a3.m0) ((s) this.f42b).f15746c)).f10929a.f11016s;
                j2.a p9 = fVar2.p();
                fVar2.q(p9, 1019, new j2.c(p9, (String) this.f43c, 5));
                return;
            case 7:
                ah.a0 a0Var = (ah.a0) this.f42b;
                b6 b6Var = (b6) this.f43c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0Var.f643n.getText());
                for (b6 b6Var2 : (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class)) {
                    if (b6Var2 == b6Var) {
                        int editTextSelectionEnd = a0Var.f643n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(b6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(b6Var2);
                        a0Var.f643n.getText().delete(spanStart, spanEnd);
                        int i12 = spanEnd - spanStart;
                        w wVar = a0Var.f643n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i12;
                        }
                        wVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 8:
                ah.a0 a0Var2 = (ah.a0) this.f42b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43c;
                if (a0Var2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    l1.f(-a0Var2.M, a0Var2.R, a0Var2.Q);
                    return;
                }
                String str6 = tL_error.text;
                if (str6.equals("REACTIONS_TOO_MANY")) {
                    str6 = LocaleController.formatPluralString("ReactionMaxCountError", a0Var2.J, new Object[0]);
                }
                zc.a0(a0Var2).t(str6, null).j();
                return;
            case 9:
                b6 b6Var3 = (b6) this.f43c;
                ah.a0 a0Var3 = ((y) this.f42b).f906e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a0Var3.f643n.getText());
                for (b6 b6Var4 : (b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), b6.class)) {
                    if (b6Var4 == b6Var3) {
                        int editTextSelectionEnd2 = a0Var3.f643n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(b6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(b6Var4);
                        a0Var3.f643n.getText().delete(spanStart2, spanEnd2);
                        int i13 = spanEnd2 - spanStart2;
                        w wVar2 = a0Var3.f643n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i13;
                        }
                        wVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 10:
                t0 t0Var = (t0) this.f42b;
                gl0 gl0Var = (gl0) this.f43c;
                t0Var.f876l = true;
                t0Var.f868a.invalidate();
                gl0Var.f25011b1 = false;
                gl0Var.invalidate();
                t0Var.c(true);
                return;
            case 11:
                w0 w0Var = (w0) this.f42b;
                ah.c cVar = (ah.c) this.f43c;
                w0Var.getText().delete(w0Var.getText().getSpanStart(cVar), w0Var.getText().getSpanEnd(cVar));
                w0Var.setCursorVisible(true);
                w0Var.setLongClickable(true);
                return;
            case 12:
                j1 j1Var = (j1) this.f42b;
                g1 g1Var = (g1) this.f43c;
                j1Var.getClass();
                TLRPC.ReactionCount reactionCount = g1Var.f740a;
                org.telegram.ui.Cells.a0 a0Var4 = j1Var.f812z;
                if (k3.s(a0Var4)) {
                    ((o4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                g1Var.Y.c(false);
                j1Var.S = null;
                j1Var.T = false;
                j1Var.U = null;
                return;
            case 13:
                ViewGroup container = (ViewGroup) this.f42b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 14:
                ((i) this.f42b).onError(this.f43c);
                return;
            case 15:
                ((i) this.f42b).onResult((v0.p) this.f43c);
                return;
            case 16:
                ((sb) this.f42b).H(ProfileActivity.m4(((e1) this.f43c).f2976c));
                return;
            case 17:
                h3 h3Var = (h3) this.f42b;
                AndroidUtilities.addToClipboard(((z0) this.f43c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(h3Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 18:
                h3 h3Var2 = (h3) this.f42b;
                e1 e1Var = (e1) this.f43c;
                long j11 = e1Var.f2976c;
                q5 q5Var = h3Var2.f3116i0;
                if (j11 != UserConfig.getInstance(q5Var.C2).getClientUserId() && ((t1Var = h3Var2.f3115h0.A0) == null || j11 != DialogObject.getPeerDialogId(t1Var.i()))) {
                    if (q5Var.O3 != null) {
                        for (int i14 = 0; i14 < q5Var.O3.peers.size(); i14++) {
                            if (j11 != DialogObject.getPeerDialogId(q5Var.O3.peers.get(i14).peer)) {
                            }
                        }
                    }
                    Context context = h3Var2.getContext();
                    long j12 = e1Var.f2976c;
                    j0 j0Var = new j0(0, h3Var2, e1Var);
                    bi.b bVar = new bi.b();
                    e3 e3Var = new e3(1, context, (c6) bVar, false);
                    e3Var.fixNavigationBar();
                    LinearLayout e = sk.e(context, 1);
                    TextView f7 = g0.f(context, 1, 20.0f);
                    f7.setTextColor(bVar.E0(g6.f19707j5));
                    f7.setTypeface(AndroidUtilities.bold());
                    f7.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    e.addView(f7, z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    m4 m4Var = new m4(context, bVar);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    e.addView(m4Var, z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final a2 a2Var = new a2(4, 21, context, bVar, true);
                    aq checkBoxRound = a2Var.getCheckBoxRound();
                    int i15 = g6.V6;
                    int i16 = g6.f19655g7;
                    int i17 = g6.f19729k7;
                    checkBoxRound.b(i15, i16, i17);
                    a2Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    a2Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.a2 a2Var2 = a2Var;
                                    a2Var2.c(!a2Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.a2 a2Var3 = a2Var;
                                    a2Var3.c(!a2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.a2 a2Var4 = a2Var;
                                    a2Var4.c(!a2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i18 = g6.f19690i6;
                    a2Var.setBackground(g6.g0(bVar.E0(i18), 2, -1));
                    e.addView(a2Var, z5.n(-1, -2));
                    final a2 a2Var2 = new a2(4, 21, context, bVar, true);
                    a2Var2.getCheckBoxRound().b(i15, i16, i17);
                    a2Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j12)), null, false, true, false);
                    a2Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.a2 a2Var22 = a2Var2;
                                    a2Var22.c(!a2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.a2 a2Var3 = a2Var2;
                                    a2Var3.c(!a2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.a2 a2Var4 = a2Var2;
                                    a2Var4.c(!a2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    a2Var2.setBackground(g6.g0(bVar.E0(i18), 2, -1));
                    e.addView(a2Var2, z5.n(-1, -2));
                    final a2 a2Var3 = new a2(4, 21, context, bVar, true);
                    a2Var3.getCheckBoxRound().b(i15, i16, i17);
                    a2Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j12)), null, false, false, false);
                    a2Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.a2 a2Var22 = a2Var3;
                                    a2Var22.c(!a2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.a2 a2Var32 = a2Var3;
                                    a2Var32.c(!a2Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.a2 a2Var4 = a2Var3;
                                    a2Var4.c(!a2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    a2Var3.setBackground(g6.g0(bVar.E0(i18), 2, -1));
                    e.addView(a2Var3, z5.n(-1, -2));
                    e9 e9Var = new e9(context, bVar);
                    e9Var.setBackgroundColor(-16777216);
                    e9Var.setFixedSize(12);
                    e.addView(e9Var, z5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    di.d dVar = new di.d(context, bVar, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new l0(a2Var, a2Var2, a2Var3, j0Var, e3Var, 0));
                    frameLayout.addView(dVar, z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 119));
                    e.addView(frameLayout, z5.n(-1, -2));
                    e3Var.setCustomView(e);
                    e3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = h3Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(e1Var.f2974a));
                ConnectionsManager.getInstance(h3Var2.N).sendRequest(deletegroupcallmessages, null);
                h3Var2.c(e1Var.f2974a);
                return;
            case 19:
                t1 t1Var2 = (t1) this.f42b;
                ArrayList arrayList = (ArrayList) this.f43c;
                t1Var2.getClass();
                int size = arrayList.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(t1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f18933id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 20:
                ((t1) this.f42b).F.remove((String) this.f43c);
                return;
            case 21:
                q5 q5Var2 = (q5) this.f42b;
                d4 d4Var = (d4) this.f43c;
                q5Var2.removeView(d4Var);
                if (q5Var2.f3520d2 == d4Var) {
                    q5Var2.f3520d2 = null;
                    return;
                }
                return;
            case 22:
                q5 q5Var3 = (q5) this.f42b;
                kc D = kc.D((Activity) this.f43c, q5Var3.C2);
                p5 p5Var = q5Var3.M2;
                if (p5Var != null && (rbVar = (rb) p5Var.f3470c) != null) {
                    j10 = rbVar.currentPosition;
                } else {
                    j10 = 0;
                }
                File h = q5Var3.O1.h();
                TL_stories.StoryItem storyItem = q5Var3.O1.f3417a;
                k8 k8Var = new k8();
                k8Var.f7202n = true;
                k8Var.f7214t = storyItem.media;
                int i20 = k8Var.f7175a;
                k8Var.f7208q = MessagesController.getInstance(i20).getPeer(storyItem.dialogId);
                k8Var.f7210r = storyItem.f19151id;
                k8Var.f7212s = storyItem.caption;
                k8Var.L = h;
                k8Var.M = false;
                k8Var.f7198k0 = 720;
                k8Var.f7200l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    k8Var.K = false;
                    if (h != null) {
                        k8Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    k8Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i21);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    k8Var.f7198k0 = documentAttribute.f18923w;
                                    k8Var.f7200l0 = documentAttribute.h;
                                    k8Var.f7193i = documentAttribute.duration;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str7 = storyItem.firstFramePath;
                        if (str7 != null) {
                            k8Var.N = str7;
                        } else if (document2.thumbs != null) {
                            for (int i22 = 0; i22 < storyItem.media.document.thumbs.size(); i22++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i22);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    k8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i20).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        k8Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                k8Var.A();
                k8Var.e(storyItem);
                dc d = fc.d(q5Var3.J0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f7254f;
                int i23 = D.f7244c;
                if (!D.d) {
                    if (MessagesController.getInstance(i23).isFrozen()) {
                        org.telegram.ui.b.b(i23);
                    } else {
                        D.f7301u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (jcVar = D.f7277n) != null && jcVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f7277n, layoutParams);
                            windowManager.addView(D.f7277n, layoutParams);
                            D.f0();
                        }
                        D.K1 = k8Var;
                        fa.a(i23, k8Var);
                        k8 k8Var2 = D.K1;
                        if (k8Var2 != null && k8Var2.K) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        D.O1 = i10;
                        D.f7295s0.f8189g = false;
                        if (d != null) {
                            D.F = d;
                            D.J = d.f6958a;
                            rectF.set(d.f6960c);
                            D.G = d.f6959b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                        }
                        D.f7290r.c();
                        wb wbVar = D.f7261h0;
                        int i24 = D.J;
                        if (i24 != 1 && i24 != 0) {
                            i11 = -14737633;
                        } else {
                            i11 = 0;
                        }
                        wbVar.setBackgroundColor(i11);
                        D.f7290r.setTranslationX(0.0f);
                        D.f7290r.setTranslationY(0.0f);
                        D.f7290r.b(0.0f);
                        D.f7290r.setScaleX(1.0f);
                        D.f7290r.setScaleY(1.0f);
                        D.K = 0.0f;
                        AndroidUtilities.lockOrientation(D.f7240b, 1);
                        k8 k8Var3 = D.K1;
                        if (k8Var3 != null) {
                            D.f7246c1.setText(k8Var3.C0);
                        }
                        D.K(new ga(D, 7), j10);
                        D.f7242b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.f7304v0 = 0L;
                        D.f7308w0 = "";
                    }
                }
                D.Q = new r2(q5Var3, 12);
                D.R = new a3(0, q5Var3, D);
                return;
            case 23:
                h5 h5Var = (h5) this.f42b;
                h5Var.getClass();
                ((jb) h5Var.f3126l.Q1).h(new y0(((sb) this.f43c).f3677f, 14, false));
                return;
            case 24:
                f6 f6Var = (f6) this.f42b;
                f6Var.h = null;
                w6 w6Var = f6Var.f3025n;
                w6Var.Q = false;
                w6Var.O.f3083c = ((String) this.f43c).toLowerCase();
                w6.b(w6Var);
                return;
            case 25:
                Utilities.Callback callback = (Utilities.Callback) this.f42b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43c;
                if (callback != null) {
                    if (tL_error2 != null) {
                        z10 = false;
                    }
                    callback.run(Boolean.valueOf(z10));
                    return;
                }
                return;
            case 26:
                g8 g8Var = (g8) this.f42b;
                TLObject tLObject = (TLObject) this.f43c;
                j8 j8Var = g8Var.f3441q;
                int i25 = g8Var.f3430c;
                ArrayList arrayList2 = g8Var.f3433i;
                g8Var.I = 0;
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
                        g8Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    g8Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        g8Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    g8Var.H = str;
                    g8Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(j8Var);
                    AndroidUtilities.runOnUIThread(j8Var);
                    return;
                }
                return;
            case 27:
                i8 i8Var = (i8) this.f42b;
                ArrayList arrayList5 = i8Var.h;
                arrayList5.clear();
                arrayList5.addAll((List) this.f43c);
                i8Var.d = true;
                i8Var.e = false;
                i8Var.d();
                NotificationCenter.getInstance(i8Var.f3180a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(i8Var.f3181b), i8Var);
                return;
            case 28:
                i8 i8Var2 = (i8) this.f42b;
                TLObject tLObject2 = (TLObject) this.f43c;
                ArrayList arrayList6 = i8Var2.f3184g;
                ArrayList arrayList7 = i8Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                    int size3 = arrayList9.size();
                    int i27 = 0;
                    while (i27 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i27);
                        i27++;
                        arrayList8.add(p8.a(tL_storyAlbum));
                    }
                    arrayList7.clear();
                    arrayList7.addAll(arrayList8);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList8);
                    i8Var2.f3183f = true;
                    i8Var2.e = false;
                    i8Var2.f(true);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    i8Var2.f3183f = true;
                    i8Var2.e = false;
                    NotificationCenter.getInstance(i8Var2.f3180a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(i8Var2.f3181b), i8Var2);
                    return;
                } else {
                    return;
                }
            default:
                o8 o8Var = (o8) this.f42b;
                o8Var.getClass();
                ((Utilities.Callback) this.f43c).run(o8Var);
                return;
        }
    }
}
