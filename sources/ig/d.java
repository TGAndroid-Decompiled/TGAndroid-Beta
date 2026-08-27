package ig;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.sy;

public final class d {

    public static int f11257m;

    public k5 f11258a;

    public Rect f11259b;

    public ArrayList f11260c;
    public View d;

    public long f11261e;

    public boolean f11262f;

    public boolean f11263g;
    public int h;

    public boolean f11264i;

    public ImageReceiver f11265j;

    public int f11266k;

    public long f11267l;

    public static d a(k5 k5Var, boolean z10, boolean z11) {
        int i10 = UserConfig.selectedAccount;
        d dVar = new d();
        dVar.f11259b = new Rect();
        dVar.f11260c = new ArrayList();
        dVar.f11263g = true;
        dVar.f11266k = -1;
        dVar.f11258a = k5Var;
        dVar.f11262f = z10;
        dVar.h = i10;
        dVar.f11264i = z11;
        dVar.f11261e = System.currentTimeMillis();
        if (z11 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            dVar.f11265j = imageReceiver;
            if (z10) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return dVar;
    }

    public final void b(Canvas canvas) {
        float fClamp;
        Rect rect = this.f11259b;
        ImageReceiver imageReceiver = this.f11265j;
        ArrayList arrayList = this.f11260c;
        boolean z10 = this.f11262f;
        if (z10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j10 = jCurrentTimeMillis - this.f11261e;
                if (j10 < 1500 && j10 > 200 && jCurrentTimeMillis - this.f11267l > 50 && Utilities.fastRandom.nextInt() % 6 == 0) {
                    c cVar = new c(this);
                    cVar.a();
                    arrayList.add(cVar);
                    this.f11267l = jCurrentTimeMillis;
                }
            }
        } else if (this.f11263g) {
            for (int i10 = 0; i10 < 7; i10++) {
                c cVar2 = new c(this);
                cVar2.a();
                arrayList.add(cVar2);
            }
        }
        if (imageReceiver != null && this.f11264i && (imageReceiver.getLottieAnimation() == null || !imageReceiver.getLottieAnimation().y())) {
            if (z10) {
                canvas.save();
                canvas.translate(rect.width() / 3.0f, 0.0f);
                imageReceiver.draw(canvas);
                canvas.restore();
            } else {
                imageReceiver.draw(canvas);
            }
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            c cVar3 = (c) arrayList.get(i11);
            float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / cVar3.f11244i) + cVar3.h;
            cVar3.h = fMin;
            float fClamp2 = Utilities.clamp(fMin, 1.0f, 0.0f);
            cVar3.h = fClamp2;
            er erVar = er.f28123g;
            float interpolation = erVar.getInterpolation(fClamp2);
            float fLerp = AndroidUtilities.lerp(cVar3.f11238a, cVar3.f11240c, interpolation);
            d dVar = cVar3.f11247l;
            k5 k5Var = dVar.f11258a;
            float f10 = cVar3.h;
            float fLerp2 = f10 < 0.3f ? AndroidUtilities.lerp(cVar3.f11239b, cVar3.d, erVar.getInterpolation(f10 / 0.3f)) : AndroidUtilities.lerp(cVar3.d, cVar3.f11241e, er.f28124i.getInterpolation((f10 - 0.3f) / 0.7f));
            float fLerp3 = AndroidUtilities.lerp(cVar3.f11242f, cVar3.f11243g, interpolation);
            if (dVar.f11262f) {
                fClamp = 1.0f;
            } else {
                float fHeight = dVar.f11259b.height() * 0.8f;
                if (fLerp2 > fHeight) {
                    fClamp = 1.0f - Utilities.clamp((fLerp2 - fHeight) / AndroidUtilities.dp(16.0f), 1.0f, 0.0f);
                } else {
                    fClamp = 1.0f;
                }
            }
            float f11 = (fLerp3 / 2.0f) * fClamp;
            canvas.save();
            if (cVar3.f11245j) {
                canvas.scale(-1.0f, 1.0f, fLerp, fLerp2);
            }
            canvas.rotate(cVar3.f11246k, fLerp, fLerp2);
            k5Var.setAlpha((int) (Utilities.clamp(cVar3.h / 0.2f, 1.0f, 0.0f) * fClamp * 255.0f));
            k5Var.setBounds((int) (fLerp - f11), (int) (fLerp2 - f11), (int) (fLerp + f11), (int) (fLerp2 + f11));
            k5Var.draw(canvas);
            k5Var.setAlpha(255);
            canvas.restore();
            if (((c) arrayList.get(i11)).h >= 1.0f) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        canvas.restore();
        View view = this.d;
        if (view != null) {
            view.invalidate();
        }
        this.f11263g = false;
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.f11261e > 2500;
    }

    public final void d(View view) {
        this.f11258a.o(view);
        ImageReceiver imageReceiver = this.f11265j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f11259b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f11265j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f11262f;
        int i10 = this.h;
        k5 k5Var = this.f11258a;
        k5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f11265j;
        if (imageReceiver == null || !this.f11264i) {
            return;
        }
        imageReceiver.onAttachedToWindow();
        TLRPC.Document document2 = k5Var.f29956e;
        TLRPC.TL_messages_stickerSet stickerSetByName = null;
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
        if (strFindAnimatedEmojiEmoticon == null || (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(strFindAnimatedEmojiEmoticon)) == null || (document = tL_availableReaction.around_animation) == null) {
            z10 = true;
            z11 = false;
        } else {
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = f11257m;
                f11257m = i11 + 1;
                sb2.append(i11);
                sb2.append(" ");
                imageReceiver.setUniqKeyPrefix(sb2.toString());
                int iF = sy.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), iF + "_" + iF + "_pcache_compress", null, null, document3, 0);
            } else {
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String strA = m0.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.setImage(forDocument, strA, null, null, document4, 0);
            }
            z11 = true;
        }
        if (!z11) {
            String str = UserConfig.getInstance(i10).genericAnimationsStickerPack;
            if (str != null && (stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName(str)) == null) {
                stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName != null) {
                if (this.f11266k < 0) {
                    this.f11266k = Math.abs(Utilities.fastRandom.nextInt() % stickerSetByName.documents.size());
                }
                if (z12) {
                    StringBuilder sb3 = new StringBuilder();
                    int i12 = f11257m;
                    f11257m = i12 + 1;
                    sb3.append(i12);
                    sb3.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb3.toString());
                    int iF2 = sy.f();
                    imageReceiver.setImage(ImageLocation.getForDocument(stickerSetByName.documents.get(this.f11266k)), iF2 + "_" + iF2 + "_pcache_compress", null, null, stickerSetByName.documents.get(this.f11266k), 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForDocument(stickerSetByName.documents.get(this.f11266k)), "60_60", null, null, stickerSetByName.documents.get(this.f11266k), 0);
                }
                z11 = true;
            }
        }
        if (z11) {
            if (imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().L(0, false, z10);
            }
            imageReceiver.setAutoRepeat(0);
        } else {
            imageReceiver.setImageBitmap(new oi0(R.raw.custom_emoji_reaction, "" + R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
