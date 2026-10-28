package li;

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r61;
public final class y extends z implements p6, r9, k0, NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener {
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
    public p3 O;
    public MessageObject P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final j0 U;
    public boolean V;
    public final int f17627n;
    public final u6 f17628r;
    public final Paint f17629s;
    public final TextPaint v;
    public final RadialProgress2 f17630w;
    public final jp0 f17631x;
    public final int f17632y;

    public y(Context context, int i10, u6 u6Var) {
        super(context);
        this.f17629s = new Paint(1);
        this.v = new TextPaint(1);
        this.E = AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(10.0f);
        this.F = dp;
        int dp2 = AndroidUtilities.dp(44.0f);
        this.G = dp2;
        this.f17627n = i10;
        this.f17628r = u6Var;
        setWillNotDraw(false);
        this.f17632y = DownloadController.getInstance(i10).generateObserverTag();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, u6Var);
        this.f17630w = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
        int i11 = this.E;
        radialProgress2.r(i11, dp, i11 + dp2, dp2 + dp);
        jp0 jp0Var = new jp0(this);
        this.f17631x = jp0Var;
        jp0Var.h = new jg.i(this);
        setMinimumHeight(AndroidUtilities.dp(66.0f));
        j0 j0Var = new j0(context, u6Var, new jg.s0(this, 5));
        this.U = j0Var;
        addView(j0Var.f17305a, kb1.i(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        t tVar;
        a aVar = this.f17652a;
        if (aVar != null && (tVar = aVar.f17056g) != null) {
            TLRPC.Document document = tVar.h;
            if (document != null) {
                return document;
            }
            return tVar.f17481i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (j()) {
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.f23683uf));
    }

    @Override
    public final void b() {
        this.U.i();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject playingMessageObject;
        MessageObject messageObject = this.P;
        if (messageObject != null && i11 == this.f17627n) {
            if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (i10 == NotificationCenter.messagePlayingProgressDidChanged && messageObject.getId() == ((Integer) objArr[0]).intValue() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    MessageObject messageObject2 = this.P;
                    messageObject2.audioProgress = playingMessageObject.audioProgress;
                    messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                    messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                    m();
                    return;
                }
                return;
            }
            l(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override
    public final void e(int i10) {
        int dp = AndroidUtilities.dp(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = dp + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.f17630w.r(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    public final TLRPC.TL_documentAttributeAudio g() {
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

    @Override
    public g1 getCaptionEditText() {
        return this.U.f17305a;
    }

    @Override
    public int getObserverTag() {
        return this.f17632y;
    }

    @Override
    public a getRow() {
        return this.f17652a;
    }

    public final void h(a aVar, p3 p3Var) {
        t tVar;
        this.f17652a = aVar;
        this.O = p3Var;
        if (aVar != null && aVar.f17056g == null) {
            aVar.f17056g = new t();
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
        if (i() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22049id = -Long.valueOf(displayDocument.f22034id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f17627n;
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
            a aVar2 = this.f17652a;
            if (aVar2 != null && (tVar = aVar2.f17056g) != null && !TextUtils.isEmpty(tVar.e)) {
                tL_message.attachPath = this.f17652a.f17056g.e;
            }
            this.P = new MessageObject(i10, tL_message, false, true);
        }
        k();
        if (this.T) {
            l(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean i() {
        t tVar;
        a aVar = this.f17652a;
        if (aVar != null && (tVar = aVar.f17056g) != null && tVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        t tVar;
        a aVar = this.f17652a;
        if (aVar != null && (tVar = aVar.f17056g) != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public final void k() {
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
            i11 = this.f17654c;
        } else {
            i11 = 0;
        }
        this.K = Math.max(0, ((i10 - this.I) - AndroidUtilities.dp(16.0f)) - i11);
        MessageObject messageObject = this.P;
        if (messageObject != null) {
            str = messageObject.getMusicAuthor(false);
        } else if (g() != null) {
            str = g().performer;
        } else {
            str = null;
        }
        MessageObject messageObject2 = this.P;
        if (messageObject2 != null) {
            str2 = messageObject2.getMusicTitle(false);
        } else if (g() != null) {
            str2 = g().title;
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
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.v;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END);
            int i14 = this.K;
            this.L = new StaticLayout(ellipsize, this.v, AndroidUtilities.dp(50.0f) + i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = AndroidUtilities.dp(11.0f) + ((i12 - AndroidUtilities.dp(30.0f)) / 2) + i13;
        }
        this.f17631x.j(this.K, AndroidUtilities.dp(30.0f));
    }

    public final void l(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File pathToAttach;
        boolean z12;
        t tVar;
        int i10 = y6.ie;
        int i11 = y6.f23473je;
        int i12 = y6.f23680uc;
        int i13 = y6.f23698vc;
        RadialProgress2 radialProgress2 = this.f17630w;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = y6.w0(y6.Bd, this.f17628r);
        int i14 = 1;
        this.V = true;
        boolean j10 = j();
        int i15 = this.f17627n;
        if (j10) {
            DownloadController.getInstance(i15).removeLoadingFileObserver(this);
            radialProgress2.p(this.f17652a.f17056g.f17479f, z10);
            radialProgress2.setIcon(3, false, z10);
            m();
            return;
        }
        if (i()) {
            document = this.f17652a.f17056g.h;
        } else {
            document = null;
        }
        String attachFileName = FileLoader.getAttachFileName(document);
        a aVar = this.f17652a;
        if (aVar != null && (tVar = aVar.f17056g) != null && !TextUtils.isEmpty(tVar.e) && new File(this.f17652a.f17056g.e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            pathToAttach = null;
        } else {
            pathToAttach = FileLoader.getInstance(i15).getPathToAttach(document, true);
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
            DownloadController.getInstance(i15).removeLoadingFileObserver(this);
            if (!MediaController.getInstance().isPlayingMessage(this.P) || MediaController.getInstance().isMessagePaused()) {
                i14 = 0;
            }
            this.R = i14;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i15).addLoadingFileObserver(attachFileName, null, this);
            boolean isLoadingFile = FileLoader.getInstance(i15).isLoadingFile(attachFileName);
            float f7 = 0.0f;
            if (!isLoadingFile) {
                this.R = 2;
                radialProgress2.p(0.0f, z10);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.R = 3;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f7 = fileProgress.floatValue();
                }
                radialProgress2.p(f7, z10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        m();
    }

    public final void m() {
        double d;
        MessageObject messageObject;
        if (!j() && (messageObject = this.P) != null) {
            jp0 jp0Var = this.f17631x;
            if (!jp0Var.e) {
                jp0Var.i(messageObject.audioProgress);
            }
        }
        int i10 = 0;
        if (j()) {
            if (g() != null) {
                d = g().duration;
                i10 = (int) d;
            }
        } else if (this.P != null && MediaController.getInstance().isPlayingMessage(this.P)) {
            i10 = this.P.audioProgressSec;
        } else {
            TLRPC.TL_documentAttributeAudio g7 = g();
            if (g7 != null) {
                d = g7.duration;
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
        this.f17630w.n(this);
        this.f17631x.f29724s = this;
        l(false);
        int i10 = this.f17627n;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.f17627n;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s9 textSelectionHelper;
        int i10;
        if (getDisplayDocument() != null) {
            this.f17630w.draw(canvas);
            int i11 = y6.f23681ud;
            u6 u6Var = this.f17628r;
            int w02 = y6.w0(i11, u6Var);
            int w03 = y6.w0(y6.f23699vd, u6Var);
            int i12 = y6.f23738xd;
            int w04 = y6.w0(i12, u6Var);
            int w05 = y6.w0(i12, u6Var);
            int w06 = y6.w0(y6.f23719wd, u6Var);
            jp0 jp0Var = this.f17631x;
            jp0Var.h(w02, w03, w04, w05, w06);
            if (!j()) {
                canvas.save();
                canvas.translate(this.I, this.J);
                jp0Var.b(canvas);
                canvas.restore();
            }
            int w07 = y6.w0(y6.f23548nd, u6Var);
            TextPaint textPaint = this.v;
            textPaint.setColor(w07);
            if (this.M != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, AndroidUtilities.dp(6.0f) + this.J);
                this.M.draw(canvas);
                canvas.restore();
            }
            if (this.L != null) {
                textPaint.setColor(y6.w0(y6.G6, u6Var));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.E, this.J - AndroidUtilities.dp(16.0f));
                this.L.draw(canvas);
                canvas.restore();
            }
            p3 p3Var = this.O;
            if (p3Var != null && (textSelectionHelper = p3Var.f17408a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f25412p0 && R <= textSelectionHelper.f25415s0) {
                    int i13 = 0;
                    if (this.H) {
                        i10 = 0;
                    } else {
                        i10 = this.f17654c;
                    }
                    float dp = AndroidUtilities.dp(8.0f) + i10;
                    float dp2 = AndroidUtilities.dp(2.0f);
                    int width = getWidth();
                    if (this.H) {
                        i13 = this.f17654c;
                    }
                    canvas.drawRoundRect(dp, dp2, (width - i13) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f17629s);
                }
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        l(true);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z11 = this.H;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f17654c;
        }
        if (z11) {
            i15 = this.f17654c;
        }
        this.U.g(i14, i15, i12 - i10, AndroidUtilities.dp(66.0f));
        k();
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
            i12 = this.f17654c;
        }
        if (z10) {
            i13 = this.f17654c;
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
        this.f17630w.p(Math.min(1.0f, f7), true);
        if (this.R != 3) {
            l(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f17630w.p(1.0f, true);
        l(true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!j()) {
            if (this.f17631x.f(x9 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.E;
            if (x9 >= i10) {
                int i11 = this.G;
                if (x9 <= i10 + i11) {
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
                if (j()) {
                    p3 p3Var = this.O;
                    if (p3Var != null) {
                        a aVar = this.f17652a;
                        v3 v3Var = p3Var.f17408a;
                        ArrayList arrayList = v3Var.f17564t3;
                        a5 a5Var = (a5) v3Var.f17547h4.remove(aVar.f17056g);
                        if (a5Var != null) {
                            a5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            f2 f2Var = v3Var.R3;
                            if (f2Var != null) {
                                f2Var.d();
                            }
                            arrayList.remove(indexOf);
                            v3Var.f32504g3.O(true);
                            f2 f2Var2 = v3Var.R3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                        }
                        v3Var.f17556p3.onContentChanged();
                    }
                } else if (this.P != null) {
                    if (i()) {
                        document = this.f17652a.f17056g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.R;
                    RadialProgress2 radialProgress2 = this.f17630w;
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
                        int i14 = this.f17627n;
                        if (i13 == 2) {
                            radialProgress2.p(0.0f, false);
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
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i10 = y6.f23683uf;
        u6 u6Var = this.f17628r;
        this.f17629s.setColor(y6.w0(i10, u6Var));
        j0 j0Var = this.U;
        if (j0Var != null) {
            j0Var.a();
        }
        try {
            if (this.V && (radialProgress2 = this.f17630w) != null) {
                radialProgress2.d = y6.w0(y6.Bd, u6Var);
            }
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(y6.w0(y6.f23357d6, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
