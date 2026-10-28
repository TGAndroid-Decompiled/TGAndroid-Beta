package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Build;
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
public final class d implements OnSuccessListener, GenericProvider, org.telegram.ui.ActionBar.b2, Vector.TLDeserializer {
    public final int f19854a;

    public d(int i10) {
        this.f19854a = i10;
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

    public static RelativeDateTimeFormatter.Direction d() {
        return RelativeDateTimeFormatter.Direction.NEXT;
    }

    public static RelativeDateTimeFormatter.RelativeUnit e() {
        return RelativeDateTimeFormatter.RelativeUnit.SECONDS;
    }

    public static String f() {
        return Build.SOC_MODEL;
    }

    public static Stream g(Path path) {
        return Stream.VivifiedWrapper.convert(Files.list(path));
    }

    public static void i(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.layoutInDisplayCutoutMode = i10;
    }

    public static RelativeDateTimeFormatter.Direction j() {
        return RelativeDateTimeFormatter.Direction.LAST;
    }

    public static RelativeDateTimeFormatter.RelativeUnit k() {
        return RelativeDateTimeFormatter.RelativeUnit.MINUTES;
    }

    public static RelativeDateTimeFormatter.RelativeUnit l() {
        return RelativeDateTimeFormatter.RelativeUnit.HOURS;
    }

    public static RelativeDateTimeFormatter.RelativeUnit m() {
        return RelativeDateTimeFormatter.RelativeUnit.DAYS;
    }

    public static RelativeDateTimeFormatter.RelativeUnit n() {
        return RelativeDateTimeFormatter.RelativeUnit.MONTHS;
    }

    public static RelativeDateTimeFormatter.RelativeUnit o() {
        return RelativeDateTimeFormatter.RelativeUnit.YEARS;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f19854a) {
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
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        e2Var.dismiss();
    }

    @Override
    public void onSuccess(Object obj) {
        AndroidUtilities.lambda$setWaitingForSms$12((Void) obj);
    }

    @Override
    public Object provide(Object obj) {
        String lambda$formatSpannableSimple$15;
        String lambda$formatSpannable$16;
        TLRPC.MessageEntity lambda$getEntities$182;
        TLRPC.MessageEntity lambda$getEntities$183;
        TLRPC.MessageEntity lambda$getEntities$184;
        TLRPC.MessageEntity lambda$getEntities$185;
        switch (this.f19854a) {
            case 3:
                lambda$formatSpannableSimple$15 = AndroidUtilities.lambda$formatSpannableSimple$15((Integer) obj);
                return lambda$formatSpannableSimple$15;
            case 4:
                lambda$formatSpannable$16 = AndroidUtilities.lambda$formatSpannable$16((Integer) obj);
                return lambda$formatSpannable$16;
            case 22:
                lambda$getEntities$182 = MediaDataController.lambda$getEntities$182((Void) obj);
                return lambda$getEntities$182;
            case 23:
                lambda$getEntities$183 = MediaDataController.lambda$getEntities$183((Void) obj);
                return lambda$getEntities$183;
            case 24:
                lambda$getEntities$184 = MediaDataController.lambda$getEntities$184((Void) obj);
                return lambda$getEntities$184;
            default:
                lambda$getEntities$185 = MediaDataController.lambda$getEntities$185((Void) obj);
                return lambda$getEntities$185;
        }
    }
}
