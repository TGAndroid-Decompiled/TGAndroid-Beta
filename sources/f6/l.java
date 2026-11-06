package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.xb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class l extends r6.a {
    public static final android.support.v4.media.session.a0 f11285e;
    public final List f11286a;
    public final Bundle f11287b;
    public int f11288c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new v(11);

    static {
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(24);
        a0Var.z(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        a0Var.z(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        a0Var.z(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        a0Var.z(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        a0Var.z(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        a0Var.z(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        a0Var.z(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        a0Var.z(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        a0Var.z(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        a0Var.z(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        a0Var.z(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        a0Var.z(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        a0Var.z(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        a0Var.z(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        a0Var.z(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        a0Var.z(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        a0Var.z(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        a0Var.z(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        a0Var.z(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        a0Var.z(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        a0Var.z(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        a0Var.z(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        a0Var.z(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        a0Var.z(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        a0Var.z(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        a0Var.z(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        a0Var.z(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        a0Var.z(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        f11285e = a0Var;
    }

    public l(ArrayList arrayList, Bundle bundle, int i7) {
        this.f11286a = arrayList;
        this.f11287b = bundle;
        this.f11288c = i7;
    }

    public static void c(int i7, String str) {
        int i10;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((HashMap) f11285e.d).get(str);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            if (i10 != i7 && i10 != 0) {
                throw new IllegalArgumentException(com.google.android.recaptcha.internal.a.l("Value for ", str, " must be a ", d[i7]));
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle) || f((Bundle) obj, (Bundle) obj2)) {
                    if (obj == null) {
                        if (obj2 != null || !bundle2.containsKey(str)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void b(String str, String str2) {
        c(1, str);
        this.f11287b.putString(str, str2);
    }

    public final JSONObject d() {
        Bundle bundle;
        int i7;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f11288c);
        } catch (JSONException unused) {
        }
        JSONArray b10 = k6.a.b(this.f11286a);
        if (b10.length() != 0) {
            try {
                jSONObject.put("images", b10);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f11288c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                bundle = this.f11287b;
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    android.support.v4.media.session.a0 a0Var = f11285e;
                    String str2 = (String) ((HashMap) a0Var.f1763b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) a0Var.d).get(str);
                        if (num != null) {
                            i7 = num.intValue();
                        } else {
                            i7 = 0;
                        }
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    if (i7 != 4) {
                                        if (i7 == 5) {
                                            long j3 = bundle.getLong(str);
                                            Pattern pattern = j6.a.f16503a;
                                            jSONObject.put(str2, j3 / 1000.0d);
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, bundle.getInt(str));
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void e(JSONObject jSONObject) {
        HashSet hashSet;
        int i7;
        Bundle bundle = this.f11287b;
        bundle.clear();
        List list = this.f11286a;
        list.clear();
        int i10 = 0;
        this.f11288c = 0;
        try {
            this.f11288c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            k6.a.c(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.f11288c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    android.support.v4.media.session.a0 a0Var = f11285e;
                    String str = (String) ((HashMap) a0Var.f1764c).get(next);
                    if (str != null) {
                        if (hashSet2.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    Integer num = (Integer) ((HashMap) a0Var.d).get(str);
                                    if (num != null) {
                                        i7 = num.intValue();
                                    } else {
                                        i7 = i10;
                                    }
                                    if (i7 != 1) {
                                        if (i7 != 2) {
                                            if (i7 != 3) {
                                                if (i7 != 4) {
                                                    if (i7 == 5) {
                                                        long optLong = jSONObject.optLong(next);
                                                        Pattern pattern = j6.a.f16503a;
                                                        hashSet = hashSet2;
                                                        try {
                                                            bundle.putLong(str, optLong * 1000);
                                                        } catch (JSONException unused2) {
                                                        }
                                                    }
                                                } else {
                                                    hashSet = hashSet2;
                                                    if (obj instanceof String) {
                                                        String str2 = (String) obj;
                                                        if (k6.a.a(str2) != null) {
                                                            bundle.putString(str, str2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else {
                                            hashSet = hashSet2;
                                            if (obj instanceof Integer) {
                                                bundle.putInt(str, ((Integer) obj).intValue());
                                            }
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                        if (obj instanceof String) {
                                            bundle.putString(str, (String) obj);
                                        }
                                    }
                                }
                            } catch (JSONException unused3) {
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                    hashSet2 = hashSet;
                    i10 = 0;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (f(this.f11287b, lVar.f11287b) && this.f11286a.equals(lVar.f11286a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int i10 = 17;
        Bundle bundle = this.f11287b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i11 = i10 * 31;
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                i10 = i11 + i7;
            }
        }
        return this.f11286a.hashCode() + (i10 * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 2, this.f11286a);
        xb.b(parcel, 3, this.f11287b);
        int i10 = this.f11288c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.s(parcel, r10);
    }

    public l(int i7) {
        this(new ArrayList(), new Bundle(), i7);
    }
}
