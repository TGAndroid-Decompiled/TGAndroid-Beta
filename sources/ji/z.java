package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.i61;
public final class z extends a0 implements org.telegram.ui.ActionBar.x5, n9, l0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
    public int E;
    public final int F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public String N;
    public r3 O;
    public MessageObject P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final k0 U;
    public final int f13690n;
    public final org.telegram.ui.ActionBar.c6 f13691r;
    public final Paint f13692s;
    public final TextPaint v;
    public final RadialProgress2 f13693w;
    public final cp0 f13694x;
    public final int f13695y;

    public z(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13692s = new Paint(1);
        this.v = new TextPaint(1);
        this.E = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.F = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.G = dp2;
        this.f13690n = i10;
        this.f13691r = c6Var;
        setWillNotDraw(false);
        this.f13695y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f13693w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.E;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        cp0 cp0Var = new cp0(this);
        this.f13694x = cp0Var;
        cp0Var.h = new ee.l(this);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        k0 k0Var = new k0(context, c6Var, new ya.c(this, 28));
        this.U = k0Var;
        addView(k0Var.f13367a, w7.a6.e(-2, -2, 51));
        d();
    }

    private TLRPC.Document getDisplayDocument() {
        u uVar;
        a aVar = this.f13119a;
        if (aVar != null && (uVar = aVar.f13106g) != null) {
            TLRPC.Document document = uVar.h;
            if (document != null) {
                return document;
            }
            return uVar.f13540i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (k()) {
            return 3;
        }
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.U.f(i10, i11);
    }

    @Override
    public final void b() {
        this.U.i();
    }

    @Override
    public final void d() {
        this.f13692s.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20224uf, this.f13691r));
        k0 k0Var = this.U;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.P;
        if (messageObject != null && i11 == this.f13690n) {
            if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (i10 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    MessageObject messageObject2 = this.P;
                    messageObject2.audioProgress = playingMessageObject.audioProgress;
                    messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                    messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                    n();
                    return;
                }
                return;
            }
            m(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override
    public final void f(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.f13693w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    @Override
    public h1 getCaptionEditText() {
        return this.U.f13367a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f13695y;
    }

    @Override
    public a getRow() {
        return this.f13119a;
    }

    public final TLRPC.TL_documentAttributeAudio h() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    public final void i(a aVar, r3 r3Var) {
        u uVar;
        this.f13119a = aVar;
        this.O = r3Var;
        if (aVar != null && aVar.f13106g == null) {
            aVar.f13106g = new u();
        }
        this.H = LocaleController.isRTL;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (j() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f19237id = -Long.valueOf(displayDocument.f19222id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f13690n;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            peer.user_id = clientUserId;
            tL_peerUser.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f13119a;
            if (aVar2 != null && (uVar = aVar2.f13106g) != null && !TextUtils.isEmpty(uVar.e)) {
                tL_message.attachPath = this.f13119a.f13106g.e;
            }
            this.P = new MessageObject(i10, tL_message, false, true);
        }
        l();
        if (this.T) {
            m(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean j() {
        u uVar;
        a aVar = this.f13119a;
        if (aVar != null && (uVar = aVar.f13106g) != null && uVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        u uVar;
        a aVar = this.f13119a;
        if (aVar != null && (uVar = aVar.f13106g) != null && uVar.a()) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i10;
        int i11;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int dp = AndroidUtilities.dp(50.0f) + this.E;
        int i12 = this.G;
        this.I = dp + i12;
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = AndroidUtilities.displaySize.x;
        }
        if (this.H) {
            i11 = this.f13121c;
        } else {
            i11 = 0;
        }
        this.K = Math.max(0, ((i10 - this.I) - AndroidUtilities.dp(16.0f)) - i11);
        MessageObject messageObject = this.P;
        if (messageObject != null) {
            str = messageObject.getMusicAuthor(false);
        } else if (h() != null) {
            str = h().performer;
        } else {
            str = null;
        }
        MessageObject messageObject2 = this.P;
        if (messageObject2 != null) {
            str2 = messageObject2.getMusicTitle(false);
        } else if (h() != null) {
            str2 = h().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i13 = this.F;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.L = null;
            this.J = ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a1.g.D(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f13694x.j(this.K, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File pathToAttach;
        boolean z12;
        u uVar;
        int i10 = org.telegram.ui.ActionBar.g6.f19997ie;
        int i11 = org.telegram.ui.ActionBar.g6.f20016je;
        int i12 = org.telegram.ui.ActionBar.g6.f20221uc;
        int i13 = org.telegram.ui.ActionBar.g6.f20239vc;
        RadialProgress2 radialProgress2 = this.f13693w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Bd, this.f13691r);
        boolean k10 = k();
        int i14 = this.f13690n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f13119a.f13106g.f13538f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        if (j()) {
            document = this.f13119a.f13106g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f13119a;
        int i15 = 1;
        if (aVar != null && (uVar = aVar.f13106g) != null && !TextUtils.isEmpty(uVar.e) && new File(this.f13119a.f13106g.e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document, true);
        }
        if (!z11 && (pathToAttach == null || !pathToAttach.exists())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(attachFileName)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            if (!MediaController.getInstance().isPlayingMessage(this.P) || MediaController.getInstance().isMessagePaused()) {
                i15 = 0;
            }
            this.R = i15;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i14).addLoadingFileObserver(attachFileName, null, this);
            boolean isLoadingFile = FileLoader.getInstance(i14).isLoadingFile(attachFileName);
            float f7 = 0.0f;
            if (!isLoadingFile) {
                this.R = 2;
                radialProgress2.o(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.R = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f7 = fileProgress.floatValue();
                }
                radialProgress2.o(f7, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        n();
    }

    public final void n() {
        double d;
        MessageObject messageObject;
        if (!k() && (messageObject = this.P) != null) {
            cp0 cp0Var = this.f13694x;
            if (!cp0Var.e) {
                cp0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (k()) {
            if (h() != null) {
                d = h().duration;
                i10 = (int) d;
            }
        } else if (this.P != null && MediaController.getInstance().isPlayingMessage(this.P)) {
            i10 = this.P.audioProgressSec;
        } else {
            TLRPC.TL_documentAttributeAudio h = h();
            if (h != null) {
                d = h.duration;
                i10 = (int) d;
            }
        }
        String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
        String str = this.N;
        if (str == null || !str.equals(formatShortDuration)) {
            this.N = formatShortDuration;
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.M = new StaticLayout(formatShortDuration, textPaint, (int) Math.ceil(textPaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.f13693w.m(this);
        this.f13694x.f24180s = this;
        m(false);
        int i10 = this.f13690n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.f13690n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o9 textSelectionHelper;
        int i10;
        if (getDisplayDocument() != null) {
            this.f13693w.draw(canvas);
            int i11 = org.telegram.ui.ActionBar.g6.f20222ud;
            org.telegram.ui.ActionBar.c6 c6Var = this.f13691r;
            int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
            int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20240vd, c6Var);
            int i12 = org.telegram.ui.ActionBar.g6.f20277xd;
            int w04 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
            int w05 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
            int w06 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20258wd, c6Var);
            cp0 cp0Var = this.f13694x;
            cp0Var.h(w02, w03, w04, w05, w06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.I, this.J);
                cp0Var.b(canvas);
                canvas.restore();
            }
            int w07 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20091nd, c6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(w07);
            if (this.M != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, AndroidUtilities.dp(6.0f) + this.J);
                this.M.draw(canvas);
                canvas.restore();
            }
            if (this.L != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, this.J - AndroidUtilities.dp(16.0f));
                this.L.draw(canvas);
                canvas.restore();
            }
            r3 r3Var = this.O;
            if (r3Var != null && (textSelectionHelper = r3Var.f13497a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f21637p0 && R <= textSelectionHelper.f21640s0) {
                    int i13 = 0;
                    if (this.H) {
                        i10 = 0;
                    } else {
                        i10 = this.f13121c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.H) {
                        i13 = this.f13121c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f13692s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        m(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z11 = this.H;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f13121c;
        }
        if (z11) {
            i15 = this.f13121c;
        }
        this.U.g(i14, i15, i12 - i10, AndroidUtilities.dp(66.0f));
        l();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.H;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f13121c;
        }
        if (z10) {
            i13 = this.f13121c;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.U.h(i12, i13, size));
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float f7;
        if (j11 <= 0) {
            f7 = 0.0f;
        } else {
            f7 = ((float) j10) / ((float) j11);
        }
        this.f13693w.o(Math.min(1.0f, f7), true);
        if (this.R != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f13693w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!k()) {
            if (this.f13694x.f(x10 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.E;
            if (x10 >= i10) {
                int i11 = this.G;
                if (x10 <= i10 + i11) {
                    int i12 = this.F;
                    if (y3 >= i12 && y3 <= i12 + i11) {
                        this.S = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.S) {
                this.S = false;
                playSoundEffect(0);
                if (k()) {
                    r3 r3Var = this.O;
                    if (r3Var != null) {
                        a aVar = this.f13119a;
                        x3 x3Var = r3Var.f13497a;
                        ArrayList arrayList = x3Var.f13635j3;
                        e5 e5Var = (e5) x3Var.X3.remove(aVar.f13106g);
                        if (e5Var != null) {
                            e5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            h2 h2Var = x3Var.H3;
                            if (h2Var != null) {
                                h2Var.d();
                            }
                            arrayList.remove(indexOf);
                            x3Var.W2.N(true);
                            h2 h2Var2 = x3Var.H3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                        }
                        x3Var.f13627f3.onContentChanged();
                    }
                } else if (this.P != null) {
                    if (j()) {
                        document = this.f13119a.f13106g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.R;
                    RadialProgress2 radialProgress2 = this.f13693w;
                    if (i13 == 0) {
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.P);
                        if (MediaController.getInstance().setPlaylist(arrayList2, this.P, 0L, false, null)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i13 == 1) {
                        if (MediaController.getInstance().lambda$startAudioAgain$7(this.P)) {
                            this.R = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i14 = this.f13690n;
                        if (i13 == 2) {
                            radialProgress2.o(0.0f, false);
                            FileLoader.getInstance(i14).loadFile(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i13 == 3) {
                            FileLoader.getInstance(i14).cancelLoadFile(document);
                            this.R = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.S = false;
        }
        if (this.S || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
