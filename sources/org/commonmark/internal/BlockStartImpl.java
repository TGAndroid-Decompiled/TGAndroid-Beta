package org.commonmark.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.android.gms.vision.face.internal.client.zzf;
import org.commonmark.parser.block.AbstractBlockParser;

public final class BlockStartImpl {
    public final Object blockParsers;
    public int newColumn;
    public int newIndex;
    public boolean replaceActiveBlockParser;

    public BlockStartImpl(Context context) {
        this.newIndex = 0;
        this.replaceActiveBlockParser = true;
        this.newColumn = 0;
        this.blockParsers = context;
    }

    public FaceDetector build() {
        boolean z;
        zzf zzfVar = new zzf();
        int i = this.newColumn;
        zzfVar.zza = i;
        int i2 = this.newIndex;
        zzfVar.zzb = i2;
        boolean z2 = false;
        zzfVar.zzc = 0;
        zzfVar.zzd = false;
        zzfVar.zze = this.replaceActiveBlockParser;
        zzfVar.zzf = -1.0f;
        if (i == 2 || i2 != 2) {
            z = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        }
        if (zzfVar.zzb == 2 && zzfVar.zzc == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z2 = z;
        }
        if (z2) {
            return new FaceDetector(new zzm((Context) this.blockParsers, zzfVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void setLandmarkType(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.newIndex = i;
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void setMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.newColumn = i;
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public BlockStartImpl(AbstractBlockParser... abstractBlockParserArr) {
        this.newIndex = -1;
        this.newColumn = -1;
        this.replaceActiveBlockParser = false;
        this.blockParsers = abstractBlockParserArr;
    }
}
