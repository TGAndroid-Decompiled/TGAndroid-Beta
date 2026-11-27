package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
public final class y54 {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final v54 H;
    public static final v54[][] I;
    public static final v54[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final List n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);
    public static final int[] p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};
    public static final byte[] u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};
    public static final byte[] w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};
    public static final byte[] z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        v54[] v54VarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        v54[] v54VarArr2 = {new v54("NewSubfileType", 254, 4), new v54("SubfileType", 255, 4), new v54(256, 3, 4, "ImageWidth"), new v54(257, 3, 4, "ImageLength"), new v54("BitsPerSample", 258, 3), new v54("Compression", 259, 3), new v54("PhotometricInterpretation", 262, 3), new v54("ImageDescription", 270, 2), new v54("Make", 271, 2), new v54("Model", 272, 2), new v54(273, 3, 4, "StripOffsets"), new v54("Orientation", 274, 3), new v54("SamplesPerPixel", 277, 3), new v54(278, 3, 4, "RowsPerStrip"), new v54(279, 3, 4, "StripByteCounts"), new v54("XResolution", 282, 5), new v54("YResolution", 283, 5), new v54("PlanarConfiguration", 284, 3), new v54("ResolutionUnit", 296, 3), new v54("TransferFunction", 301, 3), new v54("Software", 305, 2), new v54("DateTime", 306, 2), new v54("Artist", 315, 2), new v54("WhitePoint", 318, 5), new v54("PrimaryChromaticities", 319, 5), new v54("SubIFDPointer", 330, 4), new v54("JPEGInterchangeFormat", 513, 4), new v54("JPEGInterchangeFormatLength", 514, 4), new v54("YCbCrCoefficients", 529, 5), new v54("YCbCrSubSampling", 530, 3), new v54("YCbCrPositioning", 531, 3), new v54("ReferenceBlackWhite", 532, 5), new v54("Copyright", 33432, 2), new v54("ExifIFDPointer", 34665, 4), new v54("GPSInfoIFDPointer", 34853, 4), new v54("SensorTopBorder", 4, 4), new v54("SensorLeftBorder", 5, 4), new v54("SensorBottomBorder", 6, 4), new v54("SensorRightBorder", 7, 4), new v54("ISO", 23, 3), new v54("JpgFromRaw", 46, 7), new v54("Xmp", 700, 1)};
        H = new v54("StripOffsets", 273, 3);
        I = new v54[][]{v54VarArr2, new v54[]{new v54("ExposureTime", 33434, 5), new v54("FNumber", 33437, 5), new v54("ExposureProgram", 34850, 3), new v54("SpectralSensitivity", 34852, 2), new v54("PhotographicSensitivity", 34855, 3), new v54("OECF", 34856, 7), new v54("SensitivityType", 34864, 3), new v54("StandardOutputSensitivity", 34865, 4), new v54("RecommendedExposureIndex", 34866, 4), new v54("ISOSpeed", 34867, 4), new v54("ISOSpeedLatitudeyyy", 34868, 4), new v54("ISOSpeedLatitudezzz", 34869, 4), new v54("ExifVersion", 36864, 2), new v54("DateTimeOriginal", 36867, 2), new v54("DateTimeDigitized", 36868, 2), new v54("OffsetTime", 36880, 2), new v54("OffsetTimeOriginal", 36881, 2), new v54("OffsetTimeDigitized", 36882, 2), new v54("ComponentsConfiguration", 37121, 7), new v54("CompressedBitsPerPixel", 37122, 5), new v54("ShutterSpeedValue", 37377, 10), new v54("ApertureValue", 37378, 5), new v54("BrightnessValue", 37379, 10), new v54("ExposureBiasValue", 37380, 10), new v54("MaxApertureValue", 37381, 5), new v54("SubjectDistance", 37382, 5), new v54("MeteringMode", 37383, 3), new v54("LightSource", 37384, 3), new v54("Flash", 37385, 3), new v54("FocalLength", 37386, 5), new v54("SubjectArea", 37396, 3), new v54("MakerNote", 37500, 7), new v54("UserComment", 37510, 7), new v54("SubSecTime", 37520, 2), new v54("SubSecTimeOriginal", 37521, 2), new v54("SubSecTimeDigitized", 37522, 2), new v54("FlashpixVersion", 40960, 7), new v54("ColorSpace", 40961, 3), new v54(40962, 3, 4, "PixelXDimension"), new v54(40963, 3, 4, "PixelYDimension"), new v54("RelatedSoundFile", 40964, 2), new v54("InteroperabilityIFDPointer", 40965, 4), new v54("FlashEnergy", 41483, 5), new v54("SpatialFrequencyResponse", 41484, 7), new v54("FocalPlaneXResolution", 41486, 5), new v54("FocalPlaneYResolution", 41487, 5), new v54("FocalPlaneResolutionUnit", 41488, 3), new v54("SubjectLocation", 41492, 3), new v54("ExposureIndex", 41493, 5), new v54("SensingMethod", 41495, 3), new v54("FileSource", 41728, 7), new v54("SceneType", 41729, 7), new v54("CFAPattern", 41730, 7), new v54("CustomRendered", 41985, 3), new v54("ExposureMode", 41986, 3), new v54("WhiteBalance", 41987, 3), new v54("DigitalZoomRatio", 41988, 5), new v54("FocalLengthIn35mmFilm", 41989, 3), new v54("SceneCaptureType", 41990, 3), new v54("GainControl", 41991, 3), new v54("Contrast", 41992, 3), new v54("Saturation", 41993, 3), new v54("Sharpness", 41994, 3), new v54("DeviceSettingDescription", 41995, 7), new v54("SubjectDistanceRange", 41996, 3), new v54("ImageUniqueID", 42016, 2), new v54("CameraOwnerName", 42032, 2), new v54("BodySerialNumber", 42033, 2), new v54("LensSpecification", 42034, 5), new v54("LensMake", 42035, 2), new v54("LensModel", 42036, 2), new v54("Gamma", 42240, 5), new v54("DNGVersion", 50706, 1), new v54(50720, 3, 4, "DefaultCropSize")}, new v54[]{new v54("GPSVersionID", 0, 1), new v54("GPSLatitudeRef", 1, 2), new v54(2, 5, 10, "GPSLatitude"), new v54("GPSLongitudeRef", 3, 2), new v54(4, 5, 10, "GPSLongitude"), new v54("GPSAltitudeRef", 5, 1), new v54("GPSAltitude", 6, 5), new v54("GPSTimeStamp", 7, 5), new v54("GPSSatellites", 8, 2), new v54("GPSStatus", 9, 2), new v54("GPSMeasureMode", 10, 2), new v54("GPSDOP", 11, 5), new v54("GPSSpeedRef", 12, 2), new v54("GPSSpeed", 13, 5), new v54("GPSTrackRef", 14, 2), new v54("GPSTrack", 15, 5), new v54("GPSImgDirectionRef", 16, 2), new v54("GPSImgDirection", 17, 5), new v54("GPSMapDatum", 18, 2), new v54("GPSDestLatitudeRef", 19, 2), new v54("GPSDestLatitude", 20, 5), new v54("GPSDestLongitudeRef", 21, 2), new v54("GPSDestLongitude", 22, 5), new v54("GPSDestBearingRef", 23, 2), new v54("GPSDestBearing", 24, 5), new v54("GPSDestDistanceRef", 25, 2), new v54("GPSDestDistance", 26, 5), new v54("GPSProcessingMethod", 27, 7), new v54("GPSAreaInformation", 28, 7), new v54("GPSDateStamp", 29, 2), new v54("GPSDifferential", 30, 3), new v54("GPSHPositioningError", 31, 5)}, new v54[]{new v54("InteroperabilityIndex", 1, 2)}, new v54[]{new v54("NewSubfileType", 254, 4), new v54("SubfileType", 255, 4), new v54(256, 3, 4, "ThumbnailImageWidth"), new v54(257, 3, 4, "ThumbnailImageLength"), new v54("BitsPerSample", 258, 3), new v54("Compression", 259, 3), new v54("PhotometricInterpretation", 262, 3), new v54("ImageDescription", 270, 2), new v54("Make", 271, 2), new v54("Model", 272, 2), new v54(273, 3, 4, "StripOffsets"), new v54("ThumbnailOrientation", 274, 3), new v54("SamplesPerPixel", 277, 3), new v54(278, 3, 4, "RowsPerStrip"), new v54(279, 3, 4, "StripByteCounts"), new v54("XResolution", 282, 5), new v54("YResolution", 283, 5), new v54("PlanarConfiguration", 284, 3), new v54("ResolutionUnit", 296, 3), new v54("TransferFunction", 301, 3), new v54("Software", 305, 2), new v54("DateTime", 306, 2), new v54("Artist", 315, 2), new v54("WhitePoint", 318, 5), new v54("PrimaryChromaticities", 319, 5), new v54("SubIFDPointer", 330, 4), new v54("JPEGInterchangeFormat", 513, 4), new v54("JPEGInterchangeFormatLength", 514, 4), new v54("YCbCrCoefficients", 529, 5), new v54("YCbCrSubSampling", 530, 3), new v54("YCbCrPositioning", 531, 3), new v54("ReferenceBlackWhite", 532, 5), new v54("Copyright", 33432, 2), new v54("ExifIFDPointer", 34665, 4), new v54("GPSInfoIFDPointer", 34853, 4), new v54("DNGVersion", 50706, 1), new v54(50720, 3, 4, "DefaultCropSize")}, v54VarArr2, new v54[]{new v54("ThumbnailImage", 256, 7), new v54("CameraSettingsIFDPointer", 8224, 4), new v54("ImageProcessingIFDPointer", 8256, 4)}, new v54[]{new v54("PreviewImageStart", 257, 4), new v54("PreviewImageLength", 258, 4)}, new v54[]{new v54("AspectFrame", 4371, 3)}, new v54[]{new v54("ColorSpace", 55, 3)}};
        J = new v54[]{new v54("SubIFDPointer", 330, 4), new v54("ExifIFDPointer", 34665, 4), new v54("GPSInfoIFDPointer", 34853, 4), new v54("InteroperabilityIFDPointer", 40965, 4), new v54("CameraSettingsIFDPointer", 8224, 1), new v54("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            v54[][] v54VarArr3 = I;
            if (i < v54VarArr3.length) {
                K[i] = new HashMap();
                L[i] = new HashMap();
                for (v54 v54Var : v54VarArr3[i]) {
                    K[i].put(Integer.valueOf(v54Var.a), v54Var);
                    L[i].put(v54Var.b, v54Var);
                }
                i++;
            } else {
                HashMap hashMap = N;
                v54[] v54VarArr4 = J;
                hashMap.put(Integer.valueOf(v54VarArr4[0].a), 5);
                hashMap.put(Integer.valueOf(v54VarArr4[1].a), 1);
                hashMap.put(Integer.valueOf(v54VarArr4[2].a), 2);
                hashMap.put(Integer.valueOf(v54VarArr4[3].a), 3);
                hashMap.put(Integer.valueOf(v54VarArr4[4].a), 7);
                hashMap.put(Integer.valueOf(v54VarArr4[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public y54(InputStream inputStream) {
        v54[][] v54VarArr = I;
        this.e = new HashMap[v54VarArr.length];
        this.f = new HashSet(v54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        z54.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    } catch (Exception unused) {
                        if (m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                    }
                }
                this.c = null;
                this.b = null;
            }
            q(inputStream);
            return;
        }
        p3d.h("inputStream cannot be null");
        throw null;
    }

    public static ByteOrder t(t54 t54Var) {
        short readShort = t54Var.readShort();
        boolean z2 = m;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            su3.d(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[1].get("PixelXDimension");
        u54 u54Var2 = (u54) hashMapArr[1].get("PixelYDimension");
        if (u54Var != null && u54Var2 != null) {
            hashMapArr[0].put("ImageWidth", u54Var);
            hashMapArr[0].put("ImageLength", u54Var2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        w(0, "ThumbnailOrientation", "Orientation");
        w(0, "ThumbnailImageLength", "ImageLength");
        w(0, "ThumbnailImageWidth", "ImageWidth");
        w(5, "ThumbnailOrientation", "Orientation");
        w(5, "ThumbnailImageLength", "ImageLength");
        w(5, "ThumbnailImageWidth", "ImageWidth");
        w(4, "Orientation", "ThumbnailOrientation");
        w(4, "ImageLength", "ThumbnailImageLength");
        w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(O);
            hashMap.put("DateTime", new u54(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", u54.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", u54.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", u54.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", u54.a(0L, this.g));
        }
    }

    public final String b(String str) {
        u54 d = d(str);
        if (d != null) {
            int i = d.a;
            if (!M.contains(str)) {
                return d.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                w54[] w54VarArr = (w54[]) d.g(this.g);
                if (w54VarArr != null && w54VarArr.length == 3) {
                    w54 w54Var = w54VarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) w54Var.a) / ((float) w54Var.b)));
                    w54 w54Var2 = w54VarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) w54Var2.a) / ((float) w54Var2.b)));
                    w54 w54Var3 = w54VarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) w54Var3.a) / ((float) w54Var3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(w54VarArr));
                return null;
            }
            try {
                return Double.toString(d.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        u54 d = d("Orientation");
        if (d != null) {
            try {
                return d.e(this.g);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
        return 1;
    }

    public final u54 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < I.length; i++) {
            u54 u54Var = (u54) this.e[i].get(str);
            if (u54Var != null) {
                return u54Var;
            }
        }
        return null;
    }

    public final void e(x54 x54Var) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    a64.a(mediaMetadataRetriever, new s54(x54Var));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.e;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", u54.c(Integer.parseInt(str), this.g));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", u54.c(Integer.parseInt(str2), this.g));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        hashMapArr[0].put("Orientation", u54.c(i, this.g));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            x54Var.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (x54Var.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, P)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (x54Var.read(bArr2) == i3) {
                                        this.i = i2;
                                        u(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (m) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        qyc.c("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void f(defpackage.t54 r23, int r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y54.f(t54, int, int):void");
    }

    public final int g(java.io.BufferedInputStream r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y54.g(java.io.BufferedInputStream):int");
    }

    public final void h(x54 x54Var) {
        int i;
        int i2;
        k(x54Var);
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[1].get("MakerNote");
        if (u54Var != null) {
            x54 x54Var2 = new x54(u54Var.d);
            x54Var2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            x54Var2.readFully(bArr2);
            x54Var2.b(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            x54Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                x54Var2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                x54Var2.b(12L);
            }
            v(x54Var2, 6);
            u54 u54Var2 = (u54) hashMapArr[7].get("PreviewImageStart");
            u54 u54Var3 = (u54) hashMapArr[7].get("PreviewImageLength");
            if (u54Var2 != null && u54Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", u54Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", u54Var3);
            }
            u54 u54Var4 = (u54) hashMapArr[8].get("AspectFrame");
            if (u54Var4 != null) {
                int[] iArr = (int[]) u54Var4.g(this.g);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        u54 c = u54.c(i5, this.g);
                        u54 c2 = u54.c(i6, this.g);
                        hashMapArr[0].put("ImageWidth", c);
                        hashMapArr[0].put("ImageLength", c2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(t54 t54Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + t54Var);
        }
        t54Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        t54Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = t54Var.readInt();
                byte[] bArr2 = new byte[4];
                if (t54Var.read(bArr2) == 4) {
                    int i = length + 8;
                    if (i == 16 && !Arrays.equals(bArr2, z)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, A)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, y)) {
                        byte[] bArr3 = new byte[readInt];
                        if (t54Var.read(bArr3) == readInt) {
                            int readInt2 = t54Var.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.i = i;
                                u(0, bArr3);
                                A();
                                x(new t54(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + lke.a(bArr2));
                    }
                    int i2 = readInt + 4;
                    t54Var.a(i2);
                    length = i + i2;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                su3.e("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(t54 t54Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + t54Var);
        }
        t54Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        t54Var.read(bArr);
        t54Var.read(bArr2);
        t54Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        t54Var.a(i - t54Var.c);
        t54Var.read(bArr4);
        f(new t54(bArr4), i, 5);
        t54Var.a(i3 - t54Var.c);
        t54Var.b = ByteOrder.BIG_ENDIAN;
        int readInt = t54Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = t54Var.readUnsignedShort();
            int readUnsignedShort2 = t54Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = t54Var.readShort();
                short readShort2 = t54Var.readShort();
                u54 c = u54.c(readShort, this.g);
                u54 c2 = u54.c(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            t54Var.a(readUnsignedShort2);
        }
    }

    public final void k(x54 x54Var) {
        r(x54Var);
        v(x54Var, 0);
        z(x54Var, 0);
        z(x54Var, 5);
        z(x54Var, 4);
        A();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            u54 u54Var = (u54) hashMapArr[1].get("MakerNote");
            if (u54Var != null) {
                x54 x54Var2 = new x54(u54Var.d);
                x54Var2.b = this.g;
                x54Var2.a(6);
                v(x54Var2, 9);
                u54 u54Var2 = (u54) hashMapArr[9].get("ColorSpace");
                if (u54Var2 != null) {
                    hashMapArr[1].put("ColorSpace", u54Var2);
                }
            }
        }
    }

    public final void l(x54 x54Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + x54Var);
        }
        k(x54Var);
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[0].get("JpgFromRaw");
        if (u54Var != null) {
            f(new t54(u54Var.d), (int) u54Var.c, 5);
        }
        u54 u54Var2 = (u54) hashMapArr[0].get("ISO");
        u54 u54Var3 = (u54) hashMapArr[1].get("PhotographicSensitivity");
        if (u54Var2 != null && u54Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", u54Var2);
        }
    }

    public final void m(t54 t54Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + t54Var);
        }
        t54Var.b = ByteOrder.LITTLE_ENDIAN;
        t54Var.a(B.length);
        int readInt = t54Var.readInt() + 8;
        byte[] bArr = C;
        t54Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (t54Var.read(bArr2) == 4) {
                    int readInt2 = t54Var.readInt();
                    int i = length + 8;
                    if (Arrays.equals(D, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (t54Var.read(bArr3) == readInt2) {
                            this.i = i;
                            u(0, bArr3);
                            x(new t54(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + lke.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        t54Var.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                su3.e("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void n(t54 t54Var, HashMap hashMap) {
        u54 u54Var = (u54) hashMap.get("JPEGInterchangeFormat");
        u54 u54Var2 = (u54) hashMap.get("JPEGInterchangeFormatLength");
        if (u54Var != null && u54Var2 != null) {
            int e = u54Var.e(this.g);
            int e2 = u54Var2.e(this.g);
            if (this.d == 7) {
                e += this.j;
            }
            if (e > 0 && e2 > 0 && this.a == null && this.c == null && this.b == null) {
                t54Var.skip(e);
                t54Var.read(new byte[e2]);
            }
            if (m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
            }
        }
    }

    public final void o(String str) {
        boolean z2;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        try {
                            z54.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                            z2 = true;
                        } catch (Exception unused) {
                            if (m) {
                                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                            }
                            z2 = false;
                        }
                        if (z2) {
                            this.b = fileInputStream2.getFD();
                        } else {
                            this.b = null;
                        }
                        q(fileInputStream2);
                        try {
                            fileInputStream2.close();
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            p3d.h("filename cannot be null");
        }
    }

    public final boolean p(HashMap hashMap) {
        u54 u54Var = (u54) hashMap.get("ImageLength");
        u54 u54Var2 = (u54) hashMap.get("ImageWidth");
        if (u54Var != null && u54Var2 != null) {
            int e = u54Var.e(this.g);
            int e2 = u54Var2.e(this.g);
            if (e <= 512 && e2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(InputStream inputStream) {
        boolean z2 = m;
        if (inputStream != null) {
            for (int i = 0; i < I.length; i++) {
                try {
                    try {
                        this.e[i] = new HashMap();
                    } finally {
                        a();
                        if (z2) {
                            s();
                        }
                    }
                } catch (IOException | UnsupportedOperationException e) {
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        s();
                        return;
                    }
                    return;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            int g = g(bufferedInputStream);
            this.d = g;
            if (g != 4 && g != 9 && g != 13 && g != 14) {
                x54 x54Var = new x54(bufferedInputStream);
                int i2 = this.d;
                if (i2 == 12) {
                    e(x54Var);
                } else if (i2 == 7) {
                    h(x54Var);
                } else if (i2 == 10) {
                    l(x54Var);
                } else {
                    k(x54Var);
                }
                x54Var.b(this.i);
                x(x54Var);
            } else {
                t54 t54Var = new t54(bufferedInputStream);
                int i3 = this.d;
                if (i3 == 4) {
                    f(t54Var, 0, 0);
                } else if (i3 == 13) {
                    i(t54Var);
                } else if (i3 == 9) {
                    j(t54Var);
                } else if (i3 == 14) {
                    m(t54Var);
                }
            }
            if (z2) {
                return;
            }
            return;
        }
        p3d.h("inputstream shouldn't be null");
    }

    public final void r(x54 x54Var) {
        ByteOrder t2 = t(x54Var);
        this.g = t2;
        x54Var.b = t2;
        int readUnsignedShort = x54Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            su3.d(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = x54Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                x54Var.a(i2);
                return;
            }
            return;
        }
        su3.e(uh9.k(readInt, "Invalid first Ifd offset: "));
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i < hashMapArr.length) {
                StringBuilder m2 = uh9.m(i, "The size of tag group[", "]: ");
                m2.append(hashMapArr[i].size());
                Log.d("ExifInterface", m2.toString());
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    u54 u54Var = (u54) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + u54Var.toString() + ", tagValue: '" + u54Var.f(this.g) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void u(int i, byte[] bArr) {
        x54 x54Var = new x54(bArr);
        r(x54Var);
        v(x54Var, i);
    }

    public final void v(defpackage.x54 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y54.v(x54, int):void");
    }

    public final void w(int i, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void x(t54 t54Var) {
        u54 u54Var;
        int e;
        HashMap hashMap = this.e[4];
        u54 u54Var2 = (u54) hashMap.get("Compression");
        if (u54Var2 != null) {
            int e2 = u54Var2.e(this.g);
            if (e2 != 1) {
                if (e2 != 6) {
                    if (e2 != 7) {
                        return;
                    }
                } else {
                    n(t54Var, hashMap);
                    return;
                }
            }
            u54 u54Var3 = (u54) hashMap.get("BitsPerSample");
            if (u54Var3 != null) {
                int[] iArr = (int[]) u54Var3.g(this.g);
                int[] iArr2 = p;
                if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (u54Var = (u54) hashMap.get("PhotometricInterpretation")) != null && (((e = u54Var.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                    u54 u54Var4 = (u54) hashMap.get("StripOffsets");
                    u54 u54Var5 = (u54) hashMap.get("StripByteCounts");
                    if (u54Var4 != null && u54Var5 != null) {
                        long[] b = lke.b(u54Var4.g(this.g));
                        long[] b2 = lke.b(u54Var5.g(this.g));
                        if (b != null && b.length != 0) {
                            if (b2 != null && b2.length != 0) {
                                if (b.length != b2.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j2 : b2) {
                                    j += j2;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.h = true;
                                int i = 0;
                                int i2 = 0;
                                for (int i3 = 0; i3 < b.length; i3++) {
                                    int i4 = (int) b[i3];
                                    int i5 = (int) b2[i3];
                                    if (i3 < b.length - 1 && i4 + i5 != b[i3 + 1]) {
                                        this.h = false;
                                    }
                                    int i6 = i4 - i;
                                    if (i6 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    long j3 = i6;
                                    if (t54Var.skip(j3) != j3) {
                                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                                        return;
                                    }
                                    int i7 = i + i6;
                                    byte[] bArr2 = new byte[i5];
                                    if (t54Var.read(bArr2) != i5) {
                                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                                        return;
                                    }
                                    i = i7 + i5;
                                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                                    i2 += i5;
                                }
                                if (this.h) {
                                    long j4 = b[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (m) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        n(t54Var, hashMap);
    }

    public final void y(int i, int i2) {
        HashMap[] hashMapArr = this.e;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = m;
        if (!isEmpty && !hashMapArr[i2].isEmpty()) {
            u54 u54Var = (u54) hashMapArr[i].get("ImageLength");
            u54 u54Var2 = (u54) hashMapArr[i].get("ImageWidth");
            u54 u54Var3 = (u54) hashMapArr[i2].get("ImageLength");
            u54 u54Var4 = (u54) hashMapArr[i2].get("ImageWidth");
            if (u54Var != null && u54Var2 != null) {
                if (u54Var3 != null && u54Var4 != null) {
                    int e = u54Var.e(this.g);
                    int e2 = u54Var2.e(this.g);
                    int e3 = u54Var3.e(this.g);
                    int e4 = u54Var4.e(this.g);
                    if (e < e3 && e2 < e4) {
                        HashMap hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (z2) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void z(x54 x54Var, int i) {
        u54 c;
        u54 c2;
        HashMap[] hashMapArr = this.e;
        u54 u54Var = (u54) hashMapArr[i].get("DefaultCropSize");
        u54 u54Var2 = (u54) hashMapArr[i].get("SensorTopBorder");
        u54 u54Var3 = (u54) hashMapArr[i].get("SensorLeftBorder");
        u54 u54Var4 = (u54) hashMapArr[i].get("SensorBottomBorder");
        u54 u54Var5 = (u54) hashMapArr[i].get("SensorRightBorder");
        if (u54Var != null) {
            int i2 = u54Var.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                w54[] w54VarArr = (w54[]) u54Var.g(byteOrder);
                if (w54VarArr != null && w54VarArr.length == 2) {
                    c = u54.b(w54VarArr[0], this.g);
                    c2 = u54.b(w54VarArr[1], this.g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(w54VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) u54Var.g(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    c = u54.c(iArr[0], this.g);
                    c2 = u54.c(iArr[1], this.g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
        } else if (u54Var2 != null && u54Var3 != null && u54Var4 != null && u54Var5 != null) {
            int e = u54Var2.e(this.g);
            int e2 = u54Var4.e(this.g);
            int e3 = u54Var5.e(this.g);
            int e4 = u54Var3.e(this.g);
            if (e2 > e && e3 > e4) {
                u54 c3 = u54.c(e2 - e, this.g);
                u54 c4 = u54.c(e3 - e4, this.g);
                hashMapArr[i].put("ImageLength", c3);
                hashMapArr[i].put("ImageWidth", c4);
            }
        } else {
            u54 u54Var6 = (u54) hashMapArr[i].get("ImageLength");
            u54 u54Var7 = (u54) hashMapArr[i].get("ImageWidth");
            if (u54Var6 == null || u54Var7 == null) {
                u54 u54Var8 = (u54) hashMapArr[i].get("JPEGInterchangeFormat");
                u54 u54Var9 = (u54) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (u54Var8 != null && u54Var9 != null) {
                    int e5 = u54Var8.e(this.g);
                    int e6 = u54Var8.e(this.g);
                    x54Var.b(e5);
                    byte[] bArr = new byte[e6];
                    x54Var.read(bArr);
                    f(new t54(bArr), e5, i);
                }
            }
        }
    }

    public y54(String str) {
        v54[][] v54VarArr = I;
        this.e = new HashMap[v54VarArr.length];
        this.f = new HashSet(v54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            o(str);
        } else {
            p3d.h("filename cannot be null");
            throw null;
        }
    }

    public y54(File file) {
        v54[][] v54VarArr = I;
        this.e = new HashMap[v54VarArr.length];
        this.f = new HashSet(v54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            o(file.getAbsolutePath());
        } else {
            p3d.h("file cannot be null");
            throw null;
        }
    }
}
