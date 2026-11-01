package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c30 extends TLObject {
    public static final int f15061i = 0;
    public String f15062a;
    public TLRPC.InputWebFileLocation f15063b;
    public ArrayList f15064c;
    public int d;
    public String e;
    public boolean f15065f;

    public static c30 a(double d, double d10, long j10, int i10, int i11, int i12, int i13) {
        ?? tLObject = new TLObject();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        tLObject.f15063b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j10;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d10;
        tL_inputWebFileGeoPointLocation.f19868w = i10;
        tL_inputWebFileGeoPointLocation.h = i11;
        tL_inputWebFileGeoPointLocation.zoom = i12;
        tL_inputWebFileGeoPointLocation.scale = i13;
        tLObject.e = "image/png";
        tLObject.f15062a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        tLObject.f15064c = new ArrayList();
        return tLObject;
    }

    public static c30 b(TLRPC.GeoPoint geoPoint, int i10, int i11, int i12, int i13) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i10, i11, i12, i13);
    }

    public static c30 c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            ?? tLObject = new TLObject();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            tLObject.f15063b = tL_inputWebFileLocation;
            String str = webDocument.url;
            tLObject.f15062a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            tLObject.d = tL_webDocument.size;
            tLObject.e = tL_webDocument.mime_type;
            tLObject.f15064c = tL_webDocument.attributes;
            return tLObject;
        } else if (webDocument instanceof TLRPC.TL_webDocumentNoProxy) {
            ?? tLObject2 = new TLObject();
            TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
            tLObject2.f15063b = tL_inputWebFileLocation2;
            String str2 = webDocument.url;
            tLObject2.f15062a = str2;
            tL_inputWebFileLocation2.url = str2;
            tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
            tLObject2.d = tL_webDocumentNoProxy.size;
            tLObject2.e = tL_webDocumentNoProxy.mime_type;
            tLObject2.f15064c = tL_webDocumentNoProxy.attributes;
            tLObject2.f15065f = true;
            return tLObject2;
        } else {
            return null;
        }
    }
}
