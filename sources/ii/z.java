package ii;

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
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.m61;
public final class z extends a0 implements org.telegram.ui.ActionBar.z5, n9, m0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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
    public final l0 U;
    public final int f12864n;
    public final org.telegram.ui.ActionBar.e6 f12865r;
    public final Paint f12866s;
    public final TextPaint v;
    public final RadialProgress2 f12867w;
    public final gp0 f12868x;
    public final int f12869y;

    public z(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12866s = new Paint(1);
        this.v = new TextPaint(1);
        this.E = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.F = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.G = dp2;
        this.f12864n = i10;
        this.f12865r = e6Var;
        setWillNotDraw(false);
        this.f12869y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.f12867w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.E;
        radialProgress2.q(i11, dp, i11 + dp2, dp2 + dp);
        gp0 gp0Var = new gp0(this);
        this.f12868x = gp0Var;
        gp0Var.h = new de.m(this);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        l0 l0Var = new l0(context, e6Var, new a6.i(this, 27));
        this.U = l0Var;
        addView(l0Var.f12546a, w7.x5.e(-2, -2, 51));
        e();
    }

    private TLRPC.Document getDisplayDocument() {
        u uVar;
        a aVar = this.f12251a;
        if (aVar != null && (uVar = aVar.f12238g) != null) {
            TLRPC.Document document = uVar.h;
            if (document != null) {
                return document;
            }
            return uVar.f12716i;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.P;
        if (messageObject != null && i11 == this.f12864n) {
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
    public final void e() {
        this.f12866s.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21119uf, this.f12865r));
        l0 l0Var = this.U;
        if (l0Var != null) {
            l0Var.a();
        }
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
        this.f12867w.q(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    @Override
    public i1 getCaptionEditText() {
        return this.U.f12546a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getObserverTag() {
        return this.f12869y;
    }

    @Override
    public a getRow() {
        return this.f12251a;
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
        this.f12251a = aVar;
        this.O = r3Var;
        if (aVar != null && aVar.f12238g == null) {
            aVar.f12238g = new u();
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
            tL_message.f20059id = -Long.valueOf(displayDocument.f20044id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f12864n;
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
            a aVar2 = this.f12251a;
            if (aVar2 != null && (uVar = aVar2.f12238g) != null && !TextUtils.isEmpty(uVar.f12713e)) {
                tL_message.attachPath = this.f12251a.f12238g.f12713e;
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
        a aVar = this.f12251a;
        if (aVar != null && (uVar = aVar.f12238g) != null && uVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        u uVar;
        a aVar = this.f12251a;
        if (aVar != null && (uVar = aVar.f12238g) != null && uVar.a()) {
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
            i11 = this.f12253c;
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
                spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            this.L = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.dp(50.0f) + this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f12868x.j(this.K, AndroidUtilities.dp(30.0f));
    }

    public final void m(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File pathToAttach;
        boolean z12;
        u uVar;
        int i10 = org.telegram.ui.ActionBar.i6.f20896ie;
        int i11 = org.telegram.ui.ActionBar.i6.f20914je;
        int i12 = org.telegram.ui.ActionBar.i6.f21116uc;
        int i13 = org.telegram.ui.ActionBar.i6.f21133vc;
        RadialProgress2 radialProgress2 = this.f12867w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Bd, this.f12865r);
        boolean k10 = k();
        int i14 = this.f12864n;
        if (k10) {
            DownloadController.getInstance(i14).removeLoadingFileObserver(this);
            radialProgress2.o(this.f12251a.f12238g.f12714f, z10);
            radialProgress2.setIcon(3, false, z10);
            n();
            return;
        }
        if (j()) {
            document = this.f12251a.f12238g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f12251a;
        int i15 = 1;
        if (aVar != null && (uVar = aVar.f12238g) != null && !TextUtils.isEmpty(uVar.f12713e) && new File(this.f12251a.f12238g.f12713e).exists()) {
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
            gp0 gp0Var = this.f12868x;
            if (!gp0Var.f26835e) {
                gp0Var.i(messageObject.audioProgress);
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
        this.f12867w.m(this);
        this.f12868x.f26848s = this;
        m(false);
        int i10 = this.f12864n;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.f12864n;
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
            this.f12867w.draw(canvas);
            int i11 = org.telegram.ui.ActionBar.i6.f21117ud;
            org.telegram.ui.ActionBar.e6 e6Var = this.f12865r;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
            int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21134vd, e6Var);
            int i12 = org.telegram.ui.ActionBar.i6.f21171xd;
            int w04 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
            int w05 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
            int w06 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21153wd, e6Var);
            gp0 gp0Var = this.f12868x;
            gp0Var.h(w02, w03, w04, w05, w06);
            if (!k()) {
                canvas.save();
                canvas.translate(this.I, this.J);
                gp0Var.b(canvas);
                canvas.restore();
            }
            int w07 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20987nd, e6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(w07);
            if (this.M != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, AndroidUtilities.dp(6.0f) + this.J);
                this.M.draw(canvas);
                canvas.restore();
            }
            if (this.L != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, this.J - AndroidUtilities.dp(16.0f));
                this.L.draw(canvas);
                canvas.restore();
            }
            r3 r3Var = this.O;
            if (r3Var != null && (textSelectionHelper = r3Var.f12662a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f22609p0 && R <= textSelectionHelper.f22612s0) {
                    int i13 = 0;
                    if (this.H) {
                        i10 = 0;
                    } else {
                        i10 = this.f12253c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.H) {
                        i13 = this.f12253c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f12866s);
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
            i14 = this.f12253c;
        }
        if (z11) {
            i15 = this.f12253c;
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
            i12 = this.f12253c;
        }
        if (z10) {
            i13 = this.f12253c;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(66.0f) + this.U.h(i12, i13, size));
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        float f7;
        if (j10 <= 0) {
            f7 = 0.0f;
        } else {
            f7 = ((float) j3) / ((float) j10);
        }
        this.f12867w.o(Math.min(1.0f, f7), true);
        if (this.R != 3) {
            m(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f12867w.o(1.0f, true);
        m(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!k()) {
            if (this.f12868x.f(x10 - this.I, y3 - this.J, actionMasked)) {
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
                        a aVar = this.f12251a;
                        x3 x3Var = r3Var.f12662a;
                        ArrayList arrayList = x3Var.j3;
                        c5 c5Var = (c5) x3Var.X3.remove(aVar.f12238g);
                        if (c5Var != null) {
                            c5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            i2 i2Var = x3Var.H3;
                            if (i2Var != null) {
                                i2Var.d();
                            }
                            arrayList.remove(indexOf);
                            x3Var.W2.N(true);
                            i2 i2Var2 = x3Var.H3;
                            if (i2Var2 != null) {
                                i2Var2.h();
                            }
                        }
                        x3Var.f12809f3.onContentChanged();
                    }
                } else if (this.P != null) {
                    if (j()) {
                        document = this.f12251a.f12238g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.R;
                    RadialProgress2 radialProgress2 = this.f12867w;
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
                        int i14 = this.f12864n;
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
