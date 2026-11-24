package defpackage;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class sdb implements Vector.TLDeserializer, ll5, ed, wkb {
    public final byte a;

    public sdb(byte b) {
        this.a = b;
    }

    public static void a() {
        throw new IllegalStateException();
    }

    public static void b(Throwable th) {
        throw new RuntimeException(th);
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!(imageReceiver.k0 instanceof v64) && !(imageReceiver.T instanceof v64) && !(imageReceiver.b0 instanceof v64) && !(imageReceiver.n0 instanceof v64)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return;
        }
        imageReceiver.p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 0:
                return TL_stories.TL_foundStory.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TL_stories.StoryItem.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TL_stories.Boost.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TL_stories.PrepaidGiveaway.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TL_stories.TL_myBoost.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TL_stories.PeerStories.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.TL_recentStory.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TL_stories.StoryViews.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TL_stories.MediaArea.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TL_stories.StoryReaction.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TL_stories.StoryView.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TL_toncenter.onrampProviderInfo.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_toncenter.onrampMethodAvailability.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.TL_folderPeer.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.PeerLocated.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_wallet.cardSticker.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TL_wallet.currencyRate.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TL_wallet.holderDc.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TL_wallet.nftAttribute.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TL_wallet.nftItem.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TL_wallet.tonConnectRequest.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TL_wallet.tonConnectSession.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TL_wallet.walletUserAddress.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_wallet.walletTransaction.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final int e(View view) {
        ShapeDrawable shapeDrawable = ((lyb) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 26:
                hdVar.dismiss();
                return;
            default:
                hdVar.dismiss();
                return;
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
