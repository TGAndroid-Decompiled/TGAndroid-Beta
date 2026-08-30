package mg;

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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.bz;
public final class d {
    public static int f13962m;
    public l5 f13963a;
    public Rect f13964b;
    public ArrayList f13965c;
    public View d;
    public long e;
    public boolean f13966f;
    public boolean f13967g;
    public int h;
    public boolean f13968i;
    public ImageReceiver f13969j;
    public int f13970k;
    public long f13971l;

    public static d a(l5 l5Var, boolean z4, boolean z10) {
        int i10 = UserConfig.selectedAccount;
        ?? obj = new Object();
        obj.f13964b = new Rect();
        obj.f13965c = new ArrayList();
        obj.f13967g = true;
        obj.f13970k = -1;
        obj.f13963a = l5Var;
        obj.f13966f = z4;
        obj.h = i10;
        obj.f13968i = z10;
        obj.e = System.currentTimeMillis();
        if (z10 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            obj.f13969j = imageReceiver;
            if (z4) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: mg.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f13963a.o(view);
        ImageReceiver imageReceiver = this.f13969j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f13964b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f13969j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z4;
        boolean z10;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z11 = this.f13966f;
        int i10 = this.h;
        l5 l5Var = this.f13963a;
        l5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f13969j;
        if (imageReceiver != null && this.f13968i) {
            imageReceiver.onAttachedToWindow();
            TLRPC.Document document2 = l5Var.e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
            if (findAnimatedEmojiEmoticon != null && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(findAnimatedEmojiEmoticon)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z11) {
                    StringBuilder sb = new StringBuilder();
                    int i11 = f13962m;
                    f13962m = i11 + 1;
                    sb.append(i11);
                    sb.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb.toString());
                    int f10 = bz.f();
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
                    if (this.f13970k < 0) {
                        this.f13970k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                    }
                    if (z11) {
                        StringBuilder sb2 = new StringBuilder();
                        int i12 = f13962m;
                        f13962m = i12 + 1;
                        sb2.append(i12);
                        sb2.append(" ");
                        imageReceiver.setUniqKeyPrefix(sb2.toString());
                        int f11 = bz.f();
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f13970k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f13970k), 0);
                    } else {
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f13970k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f13970k), 0);
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
            imageReceiver.setImageBitmap(new gj0(R.raw.custom_emoji_reaction, "" + R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
