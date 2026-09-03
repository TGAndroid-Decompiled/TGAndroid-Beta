package ng;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.cz;
public final class d {
    public static int f16024m;
    public l5 f16025a;
    public Rect f16026b;
    public ArrayList f16027c;
    public View d;
    public long f16028e;
    public boolean f16029f;
    public boolean f16030g;
    public int h;
    public boolean f16031i;
    public ImageReceiver f16032j;
    public int f16033k;
    public long f16034l;

    public static d a(l5 l5Var, boolean z4, boolean z10) {
        int i10 = UserConfig.selectedAccount;
        ?? obj = new Object();
        obj.f16026b = new Rect();
        obj.f16027c = new ArrayList();
        obj.f16030g = true;
        obj.f16033k = -1;
        obj.f16025a = l5Var;
        obj.f16029f = z4;
        obj.h = i10;
        obj.f16031i = z10;
        obj.f16028e = System.currentTimeMillis();
        if (z10 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            obj.f16032j = imageReceiver;
            if (z4) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: ng.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f16028e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f16025a.o(view);
        ImageReceiver imageReceiver = this.f16032j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f16026b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f16032j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z4;
        boolean z10;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z11 = this.f16029f;
        int i10 = this.h;
        l5 l5Var = this.f16025a;
        l5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f16032j;
        if (imageReceiver != null && this.f16031i) {
            imageReceiver.onAttachedToWindow();
            TLRPC.Document document2 = l5Var.f28632e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
            if (findAnimatedEmojiEmoticon != null && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(findAnimatedEmojiEmoticon)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z11) {
                    StringBuilder sb = new StringBuilder();
                    int i11 = f16024m;
                    f16024m = i11 + 1;
                    sb.append(i11);
                    sb.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb.toString());
                    int f10 = cz.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z4 = true;
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    String a2 = m0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z4 = true;
                    imageReceiver.setImage(forDocument, a2, null, null, document4, 0);
                }
                z10 = true;
            } else {
                z4 = true;
                z10 = false;
            }
            if (!z10) {
                String str = UserConfig.getInstance(i10).genericAnimationsStickerPack;
                if (str != null && (tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByName(str)) == null) {
                    tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f16033k < 0) {
                        this.f16033k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                    }
                    if (z11) {
                        StringBuilder sb2 = new StringBuilder();
                        int i12 = f16024m;
                        f16024m = i12 + 1;
                        sb2.append(i12);
                        sb2.append(" ");
                        imageReceiver.setUniqKeyPrefix(sb2.toString());
                        int f11 = cz.f();
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f16033k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f16033k), 0);
                    } else {
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f16033k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f16033k), 0);
                    }
                    z10 = true;
                }
            }
            if (z10) {
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, z4);
                }
                imageReceiver.setAutoRepeat(0);
                return;
            }
            imageReceiver.setImageBitmap(new hj0(R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
