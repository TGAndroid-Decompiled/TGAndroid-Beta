package org.telegram.messenger;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;

public final class b implements OnSuccessListener, GenericProvider, org.telegram.ui.ActionBar.a2, Vector.TLDeserializer {

    public final int f19746a;

    public b(int i10) {
        this.f19746a = i10;
    }

    public static BlendMode b(Object obj) {
        return (BlendMode) obj;
    }

    public static RenderNode c(Object obj) {
        return (RenderNode) obj;
    }

    public static Stream e(Path path) throws IOException {
        return Stream.VivifiedWrapper.convert(Files.list(path));
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f19746a) {
            case 26:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i10, z10);
            case 27:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
            case 28:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        b2Var.dismiss();
    }

    @Override
    public void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$12((Void) obj);
    }

    @Override
    public Object provide(Object obj) {
        switch (this.f19746a) {
            case 3:
                return AndroidUtilities.lambda$formatSpannableSimple$15((Integer) obj);
            case 4:
                return AndroidUtilities.lambda$formatSpannable$16((Integer) obj);
            case 22:
                return MediaDataController.lambda$getEntities$181((Void) obj);
            case 23:
                return MediaDataController.lambda$getEntities$182((Void) obj);
            case 24:
                return MediaDataController.lambda$getEntities$183((Void) obj);
            default:
                return MediaDataController.lambda$getEntities$184((Void) obj);
        }
    }
}
