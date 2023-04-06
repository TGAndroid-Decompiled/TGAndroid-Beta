package com.google.android.gms.internal.mlkit_language_id;
public final class zzq {
    private static final zzt zza;

    static final class zza extends zzt {
        zza() {
        }

        @Override
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_language_id.zzq.<clinit>():void");
    }
}
