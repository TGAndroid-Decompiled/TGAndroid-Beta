package kh;

import ag.g2;
import ag.l0;
import ag.r2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import android.view.ViewGroup;
import cg.g0;
import hh.z9;
import ig.h0;
import ig.q0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import jh.b6;
import lh.ac;
import lh.d0;
import lh.e1;
import lh.e2;
import lh.h2;
import lh.i2;
import lh.k7;
import lh.ka;
import lh.l2;
import lh.l3;
import lh.m0;
import lh.n9;
import lh.o1;
import lh.o3;
import lh.o5;
import lh.oa;
import lh.rb;
import lh.s1;
import lh.sa;
import lh.sb;
import lh.v0;
import lh.va;
import lh.vb;
import lh.w3;
import lh.wa;
import lh.x6;
import lh.xb;
import lh.y1;
import lh.y6;
import lh.z1;
import nh.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

public final class c implements Runnable {

    public final int f15192a;

    public final Object f15193b;

    public c(Object obj, int i10) {
        this.f15192a = i10;
        this.f15193b = obj;
    }

    @Override
    public final void run() {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        long j10;
        short s10;
        switch (this.f15192a) {
            case 0:
                ((gi) this.f15193b).hide();
                return;
            case 1:
                r rVar = (r) this.f15193b;
                vq0 vq0Var = rVar.S;
                b6 b6Var = rVar.f15214a;
                vq0Var.a(b6Var == null ? "" : b6Var.E);
                return;
            case 2:
                ((lh.h) this.f15193b).f16051c.S = false;
                return;
            case 3:
                ((lh.l) this.f15193b).invalidateSelf();
                return;
            case 4:
                ((d0) this.f15193b).f15840g = -1L;
                return;
            case 5:
                m0 m0Var = (m0) this.f15193b;
                zf.i iVar = m0Var.f16366b.D;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.f16366b.k();
                return;
            case 6:
                ((v0) this.f15193b).a(false);
                return;
            case 7:
                o5 o5Var = (o5) this.f15193b;
                ec.e();
                g2 g2Var = new g2((n2) new r2(o5Var), 14, false);
                g2Var.setOnDismissListener(new e1(0));
                g2Var.show();
                return;
            case 8:
                ((s1) this.f15193b).G();
                return;
            case 9:
                y1 y1Var = (y1) this.f15193b;
                ArrayList arrayList = y1Var.v;
                ArrayList arrayList2 = y1Var.f17075s;
                z1 z1Var = y1Var.J;
                l2 l2Var = z1Var.f17179s;
                MediaDataController mediaDataController = MediaDataController.getInstance(((e3) l2Var).currentAccount);
                String str = y1Var.D;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (z1Var.f16935a == 1 && Emoji.fullyConsistsOfEmojis(y1Var.D)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = y1Var.D;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(((e3) l2Var).currentAccount).sendRequest(tL_messages_getStickers, new g0(15, y1Var, str));
                        return;
                    }
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = y1Var.F;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(((e3) l2Var).currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    y1Var.F = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, y1Var.D, false, new l0(y1Var, str, mediaDataController, 11), null, false, false, false, true, 50, false);
                    return;
                }
                ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                y1Var.f17077x = 0;
                arrayList2.clear();
                arrayList.clear();
                y1Var.f17078y.clear();
                y1Var.f17073n.clear();
                y1Var.f17077x++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(recentStickers);
                y1Var.f17077x = recentStickers.size() + y1Var.f17077x;
                y1Var.E = y1Var.D;
                y1Var.l();
                o1.w1(z1Var.f17173b, 0, 0);
                z1Var.f17176f.c(false);
                z1Var.f17175e.n(false);
                return;
            case 10:
                e2 e2Var = (e2) ((ch.e) this.f15193b).f2910b;
                if (e2Var.h) {
                    return;
                }
                e2Var.f15924n.setVisibility(8);
                return;
            case 11:
                i2 i2Var = (i2) ((h2) this.f15193b).f16055b;
                ArrayList arrayList3 = i2Var.f16104o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                i2Var.f16101l.d(0.0f, true);
                int i10 = i2Var.f16100k + 1;
                i2Var.f16100k = i10;
                if (i10 > arrayList3.size() - 1) {
                    i2Var.f16100k = 0;
                }
                h0 h0Var = i2Var.f16099j;
                h0Var.e((q0) arrayList3.get(i2Var.f16100k));
                i2Var.f16099j = i2Var.f16098i;
                i2Var.f16098i = h0Var;
                i2Var.f16105p.invalidate();
                return;
            case 12:
                ((FfmpegAudioWaveformLoader) this.f15193b).lambda$destroy$2();
                return;
            case 13:
                ((l3) this.f15193b).b(null);
                return;
            case 14:
                ((o3) this.f15193b).E();
                return;
            case 15:
                ka kaVar = (ka) this.f15193b;
                if (kaVar.E) {
                    kaVar.E = false;
                    kaVar.invalidate();
                    return;
                }
                return;
            case 16:
                y6 y6Var = ((x6) this.f15193b).f17037p;
                y6Var.M = System.currentTimeMillis();
                y6Var.N = 0L;
                y6Var.f17102n0 = true;
                ((oa) y6Var.f17084a).f16494a.F0.a(0L, true);
                y6Var.invalidate();
                return;
            case 17:
                lh.q qVar = (lh.q) this.f15193b;
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 18:
                lh.d dVar = (lh.d) this.f15193b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 19:
                ((n9) ((gg.k) this.f15193b).f7105n).fullScroll(130);
                return;
            case 20:
                rb rbVar = (rb) this.f15193b;
                rbVar.f16681t0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                rbVar.f16680s0.P(AndroidUtilities.emptyMotionEvent());
                return;
            case 21:
                sb sbVar = ((sa) this.f15193b).f16741g0;
                sbVar.v(true);
                sbVar.f16814w0.setCameraThumb(sbVar.A());
                return;
            case 22:
                ((va) this.f15193b).f16954w2.l1.setVisibility(8);
                return;
            case 23:
                wa waVar = (wa) this.f15193b;
                sb sbVar2 = waVar.U;
                if (sbVar2.M1 || sbVar2.L1 || sbVar2.f16818x0 == null || sbVar2.f16746b0 != 0 || sbVar2.f16771i1 == null) {
                    return;
                }
                String string = LocaleController.getString(waVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                w3 w3Var = sbVar2.f16771i1;
                w3Var.h = w3.a(string, w3Var.getTextPaint());
                sbVar2.f16771i1.t(string);
                sbVar2.f16771i1.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 24:
                ((org.telegram.ui.Components.n9) this.f15193b).setVisibility(8);
                return;
            case 25:
                vb vbVar = (vb) this.f15193b;
                try {
                    int iRound = Math.round(((vbVar.h * ((long) vbVar.f16960g.getInteger("sample-rate"))) / vbVar.f16956b) / 5.0f);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(vbVar.f16960g.getString("mime"));
                    if (mediaCodecCreateDecoderByType == null) {
                        return;
                    }
                    mediaCodecCreateDecoderByType.configure(vbVar.f16960g, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    mediaCodecCreateDecoderByType.getInputBuffers();
                    mediaCodecCreateDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    boolean z11 = false;
                    int iDequeueOutputBuffer = -1;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    short s11 = 0;
                    do {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(2500L);
                        if (iDequeueInputBuffer >= 0) {
                            int sampleData = vbVar.f16959f.readSampleData(mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer), 0);
                            if (sampleData < 0) {
                                j10 = 2500;
                                mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, vbVar.f16959f.getSampleTime(), 0);
                                vbVar.f16959f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z10 = z11;
                            j10 = 2500;
                        }
                        if (iDequeueOutputBuffer >= 0) {
                            mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo3, j10);
                        while (true) {
                            if (iDequeueOutputBuffer == -1 || z10) {
                                z11 = z10;
                            } else {
                                if (iDequeueOutputBuffer >= 0) {
                                    ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
                                    if (outputBuffer != null && bufferInfo3.size > 0) {
                                        int i14 = i13;
                                        while (true) {
                                            if (outputBuffer.remaining() > 0) {
                                                short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                                if (i14 >= iRound) {
                                                    sArr[i11 - i12] = s11;
                                                    i11++;
                                                    int i15 = i11 - i12;
                                                    if (i15 >= sArr.length || i11 >= vbVar.f16956b) {
                                                        short[] sArr2 = new short[sArr.length];
                                                        AndroidUtilities.runOnUIThread(new d5.i(vbVar, sArr, i15, 15));
                                                        sArr = sArr2;
                                                        i12 = i11;
                                                    }
                                                    if (i11 >= vbVar.d.length) {
                                                        i13 = 0;
                                                        s11 = 0;
                                                    } else {
                                                        i14 = 0;
                                                        s10 = 0;
                                                    }
                                                } else {
                                                    s10 = s11;
                                                }
                                                s11 = s10 < s12 ? s12 : s10;
                                                i14++;
                                                if (outputBuffer.remaining() >= 8) {
                                                    outputBuffer.position(outputBuffer.position() + 8);
                                                }
                                            }
                                            i13 = i14;
                                        }
                                    }
                                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    if ((bufferInfo3.flags & 4) != 0) {
                                        z11 = true;
                                    }
                                } else if (iDequeueOutputBuffer == -3) {
                                    mediaCodecCreateDecoderByType.getOutputBuffers();
                                }
                                iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                            }
                        }
                        synchronized (vbVar.f16961i) {
                            try {
                                if (!vbVar.f16962j) {
                                    if (!z11) {
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        mediaCodecCreateDecoderByType.stop();
                        mediaCodecCreateDecoderByType.release();
                        vbVar.f16959f.release();
                        return;
                    } while (i11 < vbVar.f16956b);
                    mediaCodecCreateDecoderByType.stop();
                    mediaCodecCreateDecoderByType.release();
                    vbVar.f16959f.release();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 26:
                xb xbVar = (xb) this.f15193b;
                ac acVar = xbVar.f17058c;
                if (acVar != null) {
                    long j11 = acVar.f15657a;
                    if (j11 > 0) {
                        xbVar.f17059e = j11;
                        xbVar.f17065l.q();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ac acVar2 = (ac) this.f15193b;
                MediaMetadataRetriever mediaMetadataRetriever = acVar2.f15660e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap frameAtTime = null;
                try {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(acVar2.f15664j * 1000, 2);
                    if (frameAtTime != null) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(acVar2.f15661f, acVar2.f15662g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(acVar2.f15661f / frameAtTime.getWidth(), acVar2.f15662g / frameAtTime.getHeight());
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.recaptcha.internal.a.w(frameAtTime.getWidth(), fMax, bitmapCreateBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.w(frameAtTime.getHeight(), fMax, bitmapCreateBitmap.getHeight(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(frameAtTime.getWidth(), fMax, bitmapCreateBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(frameAtTime.getHeight(), fMax, bitmapCreateBitmap.getHeight(), 2.0f));
                        if (acVar2.h) {
                            if (acVar2.f15667m == null) {
                                acVar2.f15667m = new Path();
                            }
                            acVar2.f15667m.rewind();
                            acVar2.f15667m.addCircle(acVar2.f15661f / 2.0f, acVar2.f15662g / 2.0f, Math.min(acVar2.f15661f, acVar2.f15662g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(acVar2.f15667m);
                        }
                        canvas.drawBitmap(frameAtTime, rect, rect2, acVar2.f15666l);
                        frameAtTime.recycle();
                        frameAtTime = bitmapCreateBitmap;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new k7(7, acVar2, frameAtTime));
                return;
            case 28:
                z9 z9Var = (z9) this.f15193b;
                z9Var.getClass();
                try {
                    zk0 currentListView = ((mh.g) z9Var.I0).N.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                ((e0) this.f15193b).invalidateSelf();
                return;
        }
    }
}
