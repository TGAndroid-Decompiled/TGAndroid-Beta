package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Path;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class b implements OnSuccessListener, GenericProvider, org.telegram.ui.ActionBar.b2, Vector.TLDeserializer {
    public final int f19783a;

    public b(int i9) {
        this.f19783a = i9;
    }

    public static Bitmap.CompressFormat a() {
        return Bitmap.CompressFormat.WEBP_LOSSY;
    }

    public static BlendMode b(Object obj) {
        return (BlendMode) obj;
    }

    public static RenderNode c(Object obj) {
        return (RenderNode) obj;
    }

    public static Stream e(Path path) {
        return Stream.VivifiedWrapper.convert(Files.list(path));
    }

    public static void g(WindowManager.LayoutParams layoutParams, int i9) {
        layoutParams.layoutInDisplayCutoutMode = i9;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        switch (this.f19783a) {
            case 26:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i9, z10);
            case 27:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i9, z10);
            case 28:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i9, z10);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i9, z10);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        c2Var.dismiss();
    }

    @Override
    public void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$12((Void) obj);
    }

    @Override
    public Object provide(Object obj) {
        String lambda$formatSpannableSimple$15;
        String lambda$formatSpannable$16;
        TLRPC.MessageEntity lambda$getEntities$181;
        TLRPC.MessageEntity lambda$getEntities$182;
        TLRPC.MessageEntity lambda$getEntities$183;
        TLRPC.MessageEntity lambda$getEntities$184;
        switch (this.f19783a) {
            case 3:
                lambda$formatSpannableSimple$15 = AndroidUtilities.lambda$formatSpannableSimple$15((Integer) obj);
                return lambda$formatSpannableSimple$15;
            case 4:
                lambda$formatSpannable$16 = AndroidUtilities.lambda$formatSpannable$16((Integer) obj);
                return lambda$formatSpannable$16;
            case 22:
                lambda$getEntities$181 = MediaDataController.lambda$getEntities$181((Void) obj);
                return lambda$getEntities$181;
            case 23:
                lambda$getEntities$182 = MediaDataController.lambda$getEntities$182((Void) obj);
                return lambda$getEntities$182;
            case 24:
                lambda$getEntities$183 = MediaDataController.lambda$getEntities$183((Void) obj);
                return lambda$getEntities$183;
            default:
                lambda$getEntities$184 = MediaDataController.lambda$getEntities$184((Void) obj);
                return lambda$getEntities$184;
        }
    }
}
